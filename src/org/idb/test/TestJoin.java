package org.idb.test;

/*The join() method causes the currently running threads to stop executing 
 * until the thread it joins with completes its task.*/
public class TestJoin implements Runnable {

    public static void main(String[] args) {
        try {
            Thread t = new Thread(new TestJoin());
            t.start();
            System.out.println("besides thread.....");
            t.join();
            //Thread.yield();
            System.out.println("25000 withdraw");
            //System.out.println("Complete2");
            //System.out.println("Complete3");
        } catch (Exception ex) {
            System.err.print(ex);
        }

    }

    @Override
    public void run() {
        System.out.println("deposit 500000...");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
    }
}
