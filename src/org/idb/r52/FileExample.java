package org.idb.r52;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileExample {
    public static void main(String[] args) {
        File f = new File("F:/folder2");
        if(f.mkdir()){
            System.out.println("Folder Created");
            try {
                File file = new File("F:/folder2/new.txt");
                if(file.createNewFile()){
                    System.out.println("File Created");
                    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("F:/folder2/new.txt"), true));
                    bw.write("I am done");
                    bw.close();
                    BufferedReader br = new BufferedReader(new FileReader("F:/folder2/new.txt"));
                    System.out.println(br.readLine());
                    br.close();
                }
                
                file.renameTo(new File("F:/folder2/new1.txt"));
                
            } catch (Exception e) {}
        }
            
    }
}