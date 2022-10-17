package org.idb.r52; // package declaration

import org.idb.test.*; // import statement
//import org.idb.test.Test1;

public class ImportConcept {
    
    int a, b;
    
    public int sum(int c, int d){
        a = c;
        b = d;
        return a+b;
    }
    
    public static void main(String[] args) {
        
        Test t = new Test();
        org.idb.test.Test t1 = new org.idb.test.Test();
        Test1 ts1 = new Test1(); // imported from another package
        
        AccessModifier am = new AccessModifier();
    }
}