package org.idb.r52;


class Mouse{
    int b;
    void roller(){
        System.out.println("roller");
    }
}

public class ObjectCreation {
    
    int a;
    Mouse m; //class type
    ObjectCreation ob;
    public ObjectCreation() { // to initialize the properties
        a = 10;
        m = new Mouse();
        //ob = new ObjectCreation();
    }
    
    void test(){
        ObjectCreation oc = new ObjectCreation();
        System.out.println("test method");
    }
    
    static void renderObject(){
        ObjectCreation oc = new ObjectCreation(); //inside a method
        System.out.println("renderObject method");
        oc.test();
    }
    
    
    public static void main(String[] args) {
        ObjectCreation oc = new ObjectCreation(); //inside a method
        renderObject();
        oc.m.roller();
    }
}