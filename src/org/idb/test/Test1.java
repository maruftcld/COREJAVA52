package org.idb.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Test1 {
    public static void main(String[] args) {
       /* 
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Faculty-1\\Desktop\\R-52\\Module-3\\desc\\test.txt")));
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            br.close();
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Faculty-1\\Desktop\\R-52\\Module-3\\desc\\test.txt")));
            bw.write("hello java");
            bw.close();
        } catch (Exception e) {
        }
               */
        
        File file = new File("C:\\Users\\Faculty-1\\Desktop\\R-52\\Module-3\\desc\\java");
        boolean status = file.mkdir();
        if(status){
            File f = new File("C:\\Users\\Faculty-1\\Desktop\\R-52\\Module-3\\desc\\java\\new.txt");
            try {
                boolean createStatus = f.createNewFile();
                if(createStatus){
                    System.out.println(f.getPath());
                    BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                    bw.write("hello new java");
                    bw.close();
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    System.out.println(br.readLine());
                    br.close();
                    f.delete();
                }
            } catch (Exception e) {
            }
            
        }
        
    }
}