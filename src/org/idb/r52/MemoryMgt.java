package org.idb.r52;

public class MemoryMgt {
    public static void main(String[] args) { // Line 1
        int i=1; // Line 2
        Object obj = new Object(); // Line 3
        new Object();
        MemoryMgt mmgt = new MemoryMgt(); // Line 4
        mmgt.print(obj); // Line 5
    } // Line 9
 
    private void print(Object param) { // Line 6
        String str = param.toString(); // Line 7
        System.out.println(str);
        String s = "hello";
        String ss = new String("hello");
    } // Line 8
}
