package org.idb.r52;

public class NewClass {
    
    int a;

    public NewClass() {
        
    }
    
    void abc(){
        NewClass nc = new NewClass();
        nc.a = 15;
        a = 11;
        System.out.println(this.a);
        System.out.println(a);
        System.out.println(nc.a);
        
        NewClass nc1 = new NewClass();
        nc1.a = 20;
        System.out.println(a);
        System.out.println(nc1.a);
    }
    
    public static void main(String[] args) {
        new NewClass().abc();
    }
}