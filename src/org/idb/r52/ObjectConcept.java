package org.idb.r52;

public class ObjectConcept {
    
    // instance of the class
    // object is using the structure of a class
    
    int id;
    String name;
    String subject;
    int result;
    
    
    void processResult(int i, String name, int r){
        System.out.println("The result of " + name + " is " + r);
    }
    
    public static void main(String[] args) {
       
        
        ObjectConcept student1 = new ObjectConcept(); // creating an object
        student1.processResult(101, "Mr. A", 92); // using the structure
        
        ObjectConcept student2 = new ObjectConcept(); // creating an object
        student2.processResult(102, "Mr. B", 99); // using the structure
        
        // new ObjectConcept().processResult(101, "Mr. A", 92);
       // new ObjectConcept().processResult(102, "Mr. B", 99);
       // new ObjectConcept().processResult(103, "Mr. C", 94);
    }
    
}