package org.idb.r52;

import java.sql.Date;
import java.util.Scanner;

public class ScannerClass {
    
    static void sum(int a, int b){
        System.out.println("Sum  " + (a+b));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter first value...");
        //int i1 = sc.nextInt();
        //System.out.println("Please enter second value...");
        //int i2 = sc.nextInt();
        
        //sum(i1, i2);
        
        String s = sc.nextLine();
        System.out.println(s);
    }
}