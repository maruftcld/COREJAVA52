package org.idb.r52;

public class StaticBlock {

    static {
        System.err.println("static block 1");
    }
    
    static {
        System.err.println("static block 2");
    }
    
    public StaticBlock() {
        System.out.println("constructor called");
    }
    
    void test(){
        System.out.println("test method");
    }
    
    public static void main(String[] args) {
        System.out.println("main method");
        StaticBlock sb = new StaticBlock();
        sb.test();
        sb.notifyAll();
        
    }
    
    static {
        System.err.println("static block 3");
    }
    
}