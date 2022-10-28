package org.idb.r52;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

    public static void main(String[] args) {
        try {

            File file = new File("f:\\testfolder");
            file.mkdir();
            File file2 = new File("f:\\testfolder\\a.doc");
            
            
            if (file2.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
