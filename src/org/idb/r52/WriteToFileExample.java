package org.idb.r52;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteToFileExample {

    public static void main(String[] args) {
         
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("F:\\test1.txt")));
            bw.write("Hello");
            bw.newLine();
            bw.write("World");
            bw.close();

        } catch (Exception e) {
        }
         
    }
    
}