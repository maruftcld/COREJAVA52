package org.idb.r52;

public class InnerClassConcept {
    
    int a = 11;
    static String s = "ABC";

    public InnerClassConcept() {
        System.out.println("constructor");
    }
    
    static class InnerStatic { //static class
        double d = 22.21;
        void innerMethod(){
            System.out.println("Im inner method :: Static");
            new InnerClassConcept().new InnerNonStatic().innerMethod();
        }
    }
    class InnerNonStatic { //non static class
        void innerMethod(){
            System.out.println("Im inner method :: Non-Static");
        }
    }
    
    public static void main(String[] args) {
        /*
        //InnerStatic is = new InnerStatic();
        InnerClassConcept.InnerStatic is1 = new InnerClassConcept.InnerStatic();
        is1.innerMethod();
        System.out.println(InnerClassConcept.s);

        
        InnerClassConcept ic = new InnerClassConcept();
        InnerNonStatic is2 = ic.new InnerNonStatic();
        is2.innerMethod();
        */
        new InnerClassConcept().new InnerNonStatic().innerMethod(); //non static
        new InnerClassConcept.InnerStatic().innerMethod();
        
    }
}