/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop12;

/**
 *
 * @author tania
 */
public class Main {
    public static void main(String[] args) {
        /*System.out.println("------[Thread]------");
        HiloT miHilo = new HiloT ("Primer Hilo");
        miHilo.start();
        
        new HiloT("Segundo Hilo").start();
        
        System.out.println("Termina el hilo principal");
        
        System.out.println("\n------[Runnable]------");
        HiloR miHilo3 = new HiloR();
        new Thread(miHilo3,"Tercer Hilo").start();
        new Thread(new HiloR(),"Cuarto Hilo").start();
        
        System.out.println("Termina el hilo principal");*/
        
        /*ThreadGroup grupoHilos = new ThreadGroup ("Grupo con prioridad normal");
        Thread hilo1 = new EjercicioThreadGroup(grupoHilos, "Hilo 1 con prioridad maximo");
        Thread hilo2 = new EjercicioThreadGroup(grupoHilos, "Hilo 2 con prioridad maximo");
        Thread hilo3 = new EjercicioThreadGroup(grupoHilos, "Hilo 3 con prioridad maximo");
        Thread hilo4 = new EjercicioThreadGroup(grupoHilos, "Hilo 4 con prioridad maximo");
        Thread hilo5 = new EjercicioThreadGroup(grupoHilos, "Hilo 5 con prioridad maximo");
        
        hilo1.setPriority(Thread.MAX_PRIORITY);
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
        
        System.out.println("Prioridad del grupo = "+grupoHilos.getMaxPriority());
        
        System.out.println("Prioridad del Hilo 1 = "+hilo1.getPriority());
        System.out.println("Prioridad del Hilo 2 = "+hilo2.getPriority());
        System.out.println("Prioridad del Hilo 3 = "+hilo3.getPriority());
        System.out.println("Prioridad del Hilo 4 = "+hilo4.getPriority());
        System.out.println("Prioridad del Hilo 5 = "+hilo5.getPriority());
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        
        listarHilos(grupoHilos);*/

        
    } 
    
    public static void listarHilos (ThreadGroup grupoActual){
        int numHilos;
        Thread[] listaHilos;
        
        numHilos = grupoActual.activeCount();
        listaHilos = new Thread[numHilos];
        grupoActual.enumerate(listaHilos);
        System.out.println("\nNumero de Hilos activos = "+numHilos+"\n");
        for (int i = 0; i < numHilos; i++) {
            System.out.println("Hilo activo "+i+" = "+listaHilos[i].getName());
        }
    }
}
