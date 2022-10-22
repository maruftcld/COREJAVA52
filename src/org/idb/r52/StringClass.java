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
        
        
        
        String str2 = "Java";
        String snew = new String("Hello");  // two Objects //heap //string constant pool
        
        char[] cstr = {'J', 'a', 'v', 'a'};
        String str = "Java";
        System.out.println(cstr);
        System.out.println(str.equals("Java"));
        System.out.println(str.toCharArray());
        
        
        
    }
    
}