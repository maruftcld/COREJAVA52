package org.idb.r52;

public class MethodDeclaration {

    // methods must have a return type (type == data type)
    // return type ==> 1. primitive type 2. class type 3. no type
    
    int nameOfTheMethod(){
         return 0;
    }
    boolean getStatus(){
         return true;
    }
    double getSalary(String name, double bonus, boolean status, double basic){
        //System.out.println(name + " has received salary of " + (basic+bonus) + " and status is " + status);
        return 20.220;
    }
    
    static void print(){
        System.out.println("Hello JAVA");
    }
    
    public static void main(String[] args) {
        double d = new MethodDeclaration().getSalary("Mr. Jodu", 25.22, true, 200.32);
        
        System.out.println(d);
        new MethodDeclaration().print();
    }
}