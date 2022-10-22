package org.idb.r52;

public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
        }

        String[] str = {"ABC", "DEF", "GHI", "ADE", "DFED"};
        for (int i = 0; i < str.length; i++) {
            //System.out.println(str[i]);
        }
        int count = 0;
        
        for (String s : str) {
            count++;
            int l = str.length;
            if(count == 4) System.out.println(s);
        }
    }
}