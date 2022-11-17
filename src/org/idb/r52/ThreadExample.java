package org.idb.r52;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadExample extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("t1 : " + i);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }   
}


class ThreadExample1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("t2 : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }   
}
class ThreadTest {
    public static void main(String[] args) {
        ThreadExample te = new ThreadExample();
        ThreadExample1 te1 = new ThreadExample1();
        te.setName("TH1");
        System.out.println(te.getName());
        System.out.println(te.getId());
        System.out.println(te1.getName());
        System.out.println(te1.getId());
        te.start();
        te1.start();
    }
}