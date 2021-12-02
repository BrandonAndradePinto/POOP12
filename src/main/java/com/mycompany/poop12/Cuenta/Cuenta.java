/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop12.Cuenta;

/**
 *
 * @author tania
 */
public class Cuenta extends Thread{
    private static double saldo;

    public Cuenta(String name) {
        super(name);
        saldo = 0;
    }

    @Override
    public void run() {
        if (getName().equals("Deposito 1") || getName().equals("Deposito 2")) {
            this.depositarDinero(100);
        }else{
            this.retiraDinero(50);
        }
        System.out.println("Termina el hilo "+getName());
    }
    
    public synchronized void depositarDinero(double monto){
        saldo += monto;
        System.out.println("Se depositaron "+monto+" pesos. \n Saldo restante "+saldo+" pesos");
        notifyAll();
    }
    
    public synchronized void retiraDinero(double monto){
        if (saldo <= 0) {
            try {
                System.out.println(getName()+" espera deposito. \n Saldo restante "+saldo+" pesos");
                sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        saldo -= monto;
        System.out.println(getName()+ " retiró "+monto+" pesos.\n Saldo restante "+saldo+" pesos");
        notifyAll();
    }
    
    public static void main(String[] args) {
        new Cuenta("Retiro 1").start();
        new Cuenta("Retiro 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        
        try {
            sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Saldo final = "+saldo);
    }
    
}
