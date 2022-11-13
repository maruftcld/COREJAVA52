package org.idb.r52;

/*
 * Notice how 'Starting InstanceCounter' 
 * does not appear as the first 
 * line of output.
 * This is because the class must be loaded before the 
 * main method can be executed, 
 * which means all static fields and blocks are processed in order.
 */
public class InstanceCounter {
    // a static initialization block, executed once when the class is loaded

    static {
        System.out.println("Class InstanceCounter loading...");
    }
    // a constant
    static final long ONE_DAY_IN_MILLIS = 24 * 60 * 60 * 1000;
    // a static field
      int instanceCounter;

    // a second static initialization block
    // static members are processed in the order they appear in the class
//    static {
//        // we can now acces the static fields initialized above
//        System.out.println("ONE_DAY_IN_MILLIS=" + ONE_DAY_IN_MILLIS
//                + " instanceCounter=" + instanceCounter);
//    }
    // an instance initialization block
    // instance blocks are executed each time a class instance is created
    {
        instanceCounter++;
        System.out.println("instanceCounter=" + instanceCounter);
    }
    public static void main(String[] args) {
        System.out.println("Starting InstanceCounter");
        
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        //System.out.println("instanceCounter in main=" + instanceCounter);
    }
    static {
        System.out.println("Class InstanceCounter loaded");
    }
}
