package org.idb.test;
/*Each thread has a priority. Priorities are represented by a number 
 * between 1 and 10. In most cases, thread schedular schedules the 
 * threads according to their priority (known as preemptive scheduling). 
 * But it is not guaranteed because it depends on JVM specification 
 * that which scheduling it chooses.*/
public class ThreadPriority {   

    public static void main(String args[]) {
        T1 m1 = new T1();
        m1.setName("T1");
        T2 m2 = new T2();
        m2.setName("T2");
        m1.setPriority(Thread.MIN_PRIORITY);
        //m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}

class T1 extends Thread{

    @Override
    public void run() {
        try {
           Thread.sleep(1000);
           System.out.println("running thread name:" + Thread.currentThread().getName()+" p: "+Thread.currentThread().getPriority());
        } catch (Exception e) {
        }
    }

}

class T2 extends Thread{

    @Override
    public void run() {
       try {
            Thread.sleep(5000);
            System.out.println("running thread name:" + Thread.currentThread().getName()+" p: "+Thread.currentThread().getPriority());
        } catch (Exception e) {
        }
    }

}
