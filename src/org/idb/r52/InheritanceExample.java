package org.idb.r52;

// by 'extends' keyword
// JAVA doesn't support multiple inheritance
// subclass has the access of the members of superclass
class Super { //superclass
    int superA = 11;
    void superMethod(){
        System.out.println("super's method");
    } 

    public Super() {
    }
    
    public Super(int a) {
        System.out.println("super constructor");
    }
}
class Sub extends Super { //subclass
    Super s;
    int superA = 15;
    void superMethod(){
        System.out.println("sub's method");
    }
    int subA;
    void subMethod(){}
    public Sub() {
        //super(10); //calling the constructor of super class
        super.superMethod();
        s = new Super();
        System.out.println("sub constructor");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
       
        Sub sub = new Sub(); //subclass object
        //Super sup = new Super();
        //sub.superA = 11;
        sub.s.superMethod();
   
    }
}


class Super1 { //superclass
    int superA = 11;
    void superMethod(){
        System.out.println("sub's method");
    } 

    int a[] = {15, 12, 8, 20};
}