package org.idb.test;

public class YieldDemo implements Runnable {

    Thread t;
    YieldDemo(String str) {
        t = new Thread(this, str);
        // this will call run() function
        t.start();
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            // yields control to another thread every 5 iterations
            System.out.println("14 loop : " + Thread.currentThread().getName() + " " + i);
            if ((i % 5) == 0) {
                System.out.println("16 " + Thread.currentThread().getName() + " yielding control... " + i);
                /* causes the currently executing thread object to temporarily 
                pause and allow other threads to execute */
                Thread.yield();                
            }
        }
      
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }
    public static void main(String[] args) {
        new YieldDemo("Thread 1");
        new YieldDemo("Thread 2");
        new YieldDemo("Thread 3");
    }
}


class ITest implements Runnable{
    Thread t;

    public ITest(String threadName) {
        t = new Thread(this, threadName);
    }
    
    public static void main(String[] args) {
        //new Thread(new ITest("Thread 1")).start();
        //new ITest("Thread 1");
        //new ITest("Thread 2");
        //new ITest("Thread 3");
    }

    @Override
    public void run() {
        System.out.println("hello run");
    }
}