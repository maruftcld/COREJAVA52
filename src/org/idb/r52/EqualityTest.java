package org.idb.r52;

public class EqualityTest {
    public static void main(String[] args) {
        // == checks the reference
        // equals() checks the value
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s22 = new String("Hello");
        String s3 = "Hello";
        String s4 = "Hello";
        String s5 = "Hello";
        System.out.println(s2 == s22);
        System.out.println(s2.equals(s22));
    }
}