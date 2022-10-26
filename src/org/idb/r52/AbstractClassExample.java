package org.idb.r52;


public abstract class AbstractClassExample {
    int a;
    abstract int n(); //abstract method
    int m(){return 0;} //non abstract method
}

class TestAbstract extends AbstractClassExample{
    
    //annotation method/class
    
    
    public static void main(String[] args) {
        TestAbstract ts = new TestAbstract();
        System.out.println(ts.a);
    }

    @Override
    int n() {
        return 0;
    }
}