package org.idb.r52;

public class ToStringExample{

    // tostring is the string representation of an object
    @Override
    public String toString() {
        System.out.println("inside tostring");
        return "Hello toString()"; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        ToStringExample ts = new ToStringExample();
        System.out.println(ts);
        System.out.println();
    }
}