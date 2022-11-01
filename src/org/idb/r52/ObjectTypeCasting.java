package org.idb.r52;


class SuperC {}
class SubC extends SuperC {}

public class ObjectTypeCasting {
    
    //object type casting
    public static void main(String[] args) {
        //upcasting - parent to child
        SuperC sc1 = new SuperC();
        SuperC sc2 = new SubC();
        
        //downcasting - child to parent
        SubC sb1 = new SubC();
        SubC sb2 = (SubC) new SuperC();
        
    }
}