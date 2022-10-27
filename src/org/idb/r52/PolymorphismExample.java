package org.idb.r52;

//compile time polymorphism - method overloading
//run time polymorphism - method overriding
public class PolymorphismExample implements IA{
    
    void m(){}
    void m(int a){}
    void m(int a, int b){}

    @Override
    public void n() {
    }

    @Override
    public void n(int a) {
    }

    @Override
    public void n(int a, int b) {
    }

}
interface IA{
    void n();
    void n(int a);
    void n(int a, int b);
}