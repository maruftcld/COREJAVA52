package org.idb.test;

import org.idb.r52.ImportConcept;

public class Test {
    public String book = "JAVA 2.0";
    
    public static void main(String[] args) {
        ImportConcept ic = new ImportConcept();
        System.out.println(ic);
        ImportConcept ic1 = new ImportConcept();
        System.out.println(ic1);
        
        
        System.out.println(ic == ic1);
        
       // int output = ic.sum(10, 20);
       // System.out.println(output);
    }
}