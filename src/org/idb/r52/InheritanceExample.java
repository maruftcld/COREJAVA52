package org.idb.r52;

// by 'extends' keyword
// JAVA doesn't support multiple inheritance
// subclass has the access of the members of superclass
class Super { //superclass
    int superA = 11;
    void superMethod(){} 

    public Super(int a) {
        System.out.println("super constructor");
    }
    
}
class Super1 { //superclass
    int superA = 11;
    void superMethod(){} 

}
class Sub extends Super { //subclass
    int superA = 15;
    void superMethod(){}
    
    int subA;
    void subMethod(){}

    public Sub() {
        super(10); //calling the constructor of super class
        System.out.println("sub constructor");
    }
}

public class InheritanceExample {
        
    public static void main(String[] args) {
        Sub sub = new Sub(); //subclass object
        //Super sup = new Super();
        System.out.println(sub.superA);
        //sub.superA = 11;
        
    }
}