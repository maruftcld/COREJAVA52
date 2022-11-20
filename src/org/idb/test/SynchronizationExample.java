package org.idb.test;

public class SynchronizationExample extends Thread{

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        synchronized(new Object()){
            show();
        }
    }
    
    synchronized void show(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " +i);
                Thread.sleep(300 * (long) (Math.random()*10));
            }
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        SynchronizationExample th1 = new SynchronizationExample();
        SynchronizationExample th2 = new SynchronizationExample();
        th1.start();
        th2.start();
    }
    


    
}