package org.idb.r52;

public class StringClass {
    // all the strings in java are immutable
    public static void main(String[] args) {
        String s = new String("Hello Java");
        String s1 = new String("Hello Java");
        System.out.println(s == s1);
        
        String ss = "Hello Java";
        String ss1 = "Hello Java";
        // string pool
        
        System.out.println(ss.equals(ss1));
    }
    
}