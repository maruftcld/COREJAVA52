package org.idb.r52;

public class IThreadExample implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("t1 : " + i);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            
            }
        }
    }
}
class IThreadExample1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("t2 : " + i);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            
            }
        }
    }
}

class IThreadTest {
    public static void main(String[] args) {
        new Thread(new IThreadExample()).start();
        new Thread(new IThreadExample1()).start();
    }
}
