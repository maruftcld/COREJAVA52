package org.idb.test;


public class TestClock {
    static final TestClock LOCK = new TestClock();

    public static void main(String[] args) throws InterruptedException {
        Thread tick = new Thread(new Tick());
        Thread tock = new Thread(new Tock());
        tick.start();
        tock.start();//notify
       
        tick.join();
        tock.join();   
    }
}
