package org.idb.r52;

public class VarLengthArguments {
    
    static void test(String... s){
        System.out.println(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (String s1 : s) {
            //System.out.println(s1);
        }
    }
    
    public static void main(String[] args) {
        test("A", "B", "C", "D");
    }
}