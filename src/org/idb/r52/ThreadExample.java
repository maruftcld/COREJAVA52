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
        new ThreadExample().start();
        new ThreadExample1().start();
    }
}