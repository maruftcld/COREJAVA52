package org.idb.r52;

public class MultiDimensionalArray {
    
    int arr[][];
    
    public static void main(String[] args) {
        int arr2[][] = {{1,2,3}, {4,5,6}, {7,8,9, 10, 11}};
        //System.out.println(arr2[2][2]);
        
        for (int i = 0; i < arr2[1].length; i++) {
            System.out.println(arr2[1][i]);
        }
        
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }
        
        int[][] arrX = new int[3][];
        int[][][] arrY = new int[3][][];
    }
}