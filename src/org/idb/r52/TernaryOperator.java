package org.idb.r52;

public class TernaryOperator {
    public static void main(String[] args) {
        int value = 7;
        String s = (value == 8)? "True" : "False";
        System.out.println(s);
        
        int ss = (value == 7)? 7 : 8;
        System.out.println(ss);
    }
}