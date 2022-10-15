package org.idb.r52;

// Member 1 : Property (variables - global variables)
// Member 2 : Methods

public class Variables {
    
    int number; //instance variable / global variable
    static int age;
    double salary = 1000.23;
    final double  VALUE_OF_PI = 3.1416;
    
     
    void getSalary(){
        final double VALUE_OF_PI;
        VALUE_OF_PI = 3.1416;
        salary = 1233.33;
        System.err.println(VALUE_OF_PI); //red
    }
    
    
    void getAge(){
        int a;
        a = 10;
        System.err.println(age); //red
    }
    
    public static void main(String[] args) {
        int age = 10; // local variable
        System.out.println(age); //black
        new Variables().getSalary();
    }
}