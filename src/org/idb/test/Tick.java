package org.idb.test;


public class Tick implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.print("Tick ");
                Thread.sleep(500);
                synchronized (TestClock.LOCK) {
                    TestClock.LOCK.notify();//notify tock, it's his turn  [1]
                    TestClock.LOCK.wait();//and wait until tock notify you for next cycle  [4]
                }
            }
        } catch (InterruptedException e) {
        }
        
 
    }
    
}
