package org.idb.r52;

public class JavaEnum {
    final int i = 10;
    
    public enum myconstvalues {
        SAT, SUN, MON
    };
    
    public static void main(String[] args) {
        System.out.println(myconstvalues.values().toString());
        for (myconstvalues arg : myconstvalues.values()) {
            System.out.println(arg);
        }
    }
}