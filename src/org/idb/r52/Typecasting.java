package org.idb.r52;

public class Typecasting {

    //primitive type casting
    public static void main(String[] args) {
        
        //widening casting (automatic)
        double d = 10.25;
        int i = 14;
        double dd = i;
        long l = i;

        //Narrowing casting
        double d1 = 25.99;
        int i1 = 12;
        int i2 = (int) d1;
        long l1 = 1524L;
        int i3 = (int) l1;
        System.out.println(i2);
    }
}