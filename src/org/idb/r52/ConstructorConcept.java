package org.idb.r52;

public class ConstructorConcept {
    
    //global variables
    static int id;
    static String name;
    static double salary;
    
    
    //static void Method(){}
    // JVM provided constructor's name is Default Constructor
    //no-argument constructor
    // argumented constructor

    public ConstructorConcept(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
//    ConstructorConcept(){
//    }


    /*
    ConstructorConcept(int a){ //constructor overloading
        System.out.println("i am a constructor");
    }
    */
    public static void main(String[] args) {
        //ConstructorConcept/*Class Reference*/ cc/*Object Reference/ Object*/ = new/*key word*/ ConstructorConcept();
        ConstructorConcept ccs = new ConstructorConcept(101, "Mr. A", 2000.001);
        //Method();
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        
        ConstructorConcept ccs1 = new ConstructorConcept(102, "Mr.B", 54600.001);
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        
       

    }
}