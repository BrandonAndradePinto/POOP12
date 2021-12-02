package com.mycompany.poop12;

/**
 *
 * @author tania
 */
public class EjercicioThreadGroup extends Thread{
    
    public EjercicioThreadGroup(ThreadGroup group, String name){
        super(group, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
        }
    }
    
}
