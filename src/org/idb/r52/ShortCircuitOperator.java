package org.idb.r52;

public class ShortCircuitOperator {
    
    void test() throws ArithmeticException{
        System.out.println(1/0);
    }
    void test2() throws Exception{
        try {
            test();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    public static void main(String[] args) throws Exception {
        
        ShortCircuitOperator so = new ShortCircuitOperator();
        so.test2();
        boolean b = false;
        int x = 10;
        int y = 15;
        int z = 20;
        
        if((x>y) && (b=true)){
            String s = "10";
            Integer.valueOf(s);
            System.out.println("if block  " + b);
        }else{
            System.out.println("else block  " + b);
        }
    }
}