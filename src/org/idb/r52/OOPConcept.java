package org.idb.r52;

public class OOPConcept {
    
    int a;
    int m(){return 0;}
    
    static int s;
    static int ms(){return 0;}
    
    void abc(){
        OOPConcept oc = new OOPConcept();
        OOPConcept.s = 10;
    }
    
    public static void main(String[] args) {
        OOPConcept oc = new OOPConcept();
        //inheritance - relationship between classes & interfaces
        //polymorphism - overloading & overriding
        //encapsulation - data hiding
        //abstraction - procedure implemention hiding
        OOPConcept.ms();
    }
}