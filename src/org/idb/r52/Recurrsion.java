package org.idb.r52;

public class Recurrsion {
    static int x  = 5;
    static void call1(int y){
        System.out.println("called");
        if(y==1){
            System.out.println(y);
        }else{
            call1(--y);
        }
    }
    
    public static void main(String[] args) {
        call1(5);
    }
}