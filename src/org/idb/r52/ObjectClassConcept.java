package org.idb.r52;


//inheritance
//polymorphism
//encapsulation
//abstraction

class Trainee{
     int id;
     String name;
     double salary;
     Address addr;
     Course course;
}
class Address{
    int id;
    String area;
    String city;
}
public class ObjectClassConcept {
    static int a; // primitive type
    double d;
    static String s;
    static Trainee p, p2, p3, p4; // class type
    static Trainee t;
    public static void main(String[] args) {    
       // System.out.println(t.addr);
        t = new Trainee(); // mirror of Trainee Class = 1
        t.id = 10;
        t.name = "Mr. Trainee";
        t.salary = 20.021;
        Address ad = new Address();
        Address add1 = t.addr = new Address();
        System.out.println(t.addr);
        Address add = t.addr = new Address(); // Mirror of Adress class through 1
         System.out.println(t.addr);
        System.out.println(add.id);
        //t.addr.
        
        a = 10;
        a = 11;
        a = 12;
        p = new Trainee(); // new memory allocation
        System.out.println(p);        
        //System.exit(0); // calling the exit method
        p2 = new Trainee(); // new memory allocation
        System.out.println(p2);
        p3 = new Trainee(); // new memory allocation
        System.out.println(p3);
        p4 = new Trainee(); // new memory allocation
        System.out.println(p4);
        p.id = 100;
        p2.id = 200;
        p3.id = 300;
        p4.id = 400;
        //System.err.println(p.id);
        //System.err.println(p2.id);
        //System.err.println(p3.id);
        //System.err.println(p4.id);
  
    }
}


final class Course{
    int courseID;
    String courseName;
    String courseType;
    
        static class Department{}
}

