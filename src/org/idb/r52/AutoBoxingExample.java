package org.idb.r52;


public class AutoBoxingExample {

    public static void main(String[] args) {
        int pInt = 420;
        Integer wInt = new Integer(pInt); // this is called boxing
        int p2 = wInt; // this is called unboxing
        System.out.println(p2);
        Character b = new Character('A');
        
        double dd = 101;
        Double d = new Double(dd);
        dd = d;
    }
}
