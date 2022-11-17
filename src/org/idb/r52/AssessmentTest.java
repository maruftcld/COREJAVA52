package org.idb.r52;

public class AssessmentTest {
    public static void main(String[] args) {
//        int sum = 0;
//        int i = 0;
//        while(i<5){
//            sum = sum + i++;
//            i++;
//        }
//        System.out.println(i);
//        System.out.println(" ");
//        System.out.println(sum);
        int i = 0;
        while(i<10){
            i++;
            ++i;
            i += i++;
            i += ++i;
        }
    }
}