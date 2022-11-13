package org.idb.r52;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        
        for (Object q1 : q) {
            System.out.print(q1);
        }
        System.out.println("");
        
        //System.out.println(q.peek());
        //System.out.println(q.poll());
        //System.out.println(q.poll());
        
    }
}