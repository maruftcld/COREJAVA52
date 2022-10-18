package org.idb.r52;


// non static content == static + non-static
// static content == static
public class StaticConcept {
    int a;
    int b;
    
    // static basically relates to memory management
    static int sa = 122;
    static int sb;

    public StaticConcept() {
        
    }
    

    static void staticMethod(){
        // a = 10; b = 15; // non-static property can not be accessed
        StaticConcept sc = new StaticConcept();
        sc.a = 10; sc.b = 15; // non-static property can be accessed through the Object
        sa = 10; sb = 15; // static property access
    }
    
    void nonStaticMethod(){ // non-static method
        a = 10; b = 15; // non-static property access
        sa = 10; sb = 15; // static property access
    }
    
    public static void main(String[] args) {
        StaticConcept sc1 = new StaticConcept();
        sc1.a = 10; //non-static
        System.out.println(sc1.sa);
        
        StaticConcept sc2 = new StaticConcept();
        sc2.a = 15; //non-static
        System.out.println(sc2.sa);

        StaticConcept sc3 = new StaticConcept();
        sc3.a = 20; //non-static
        System.out.println(sc3.sa);
        
        StaticConcept.sa = 100;

    }
}