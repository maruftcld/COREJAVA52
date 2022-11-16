package org.idb.test;

public class Tock implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                synchronized (TestClock.LOCK) {
                    TestClock.LOCK.wait();
                }
                System.out.print("Tock (" + (i) + ")\n");
                Thread.sleep(500);
                synchronized (TestClock.LOCK) {
                    TestClock.LOCK.notify();
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
