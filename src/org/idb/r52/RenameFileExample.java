package org.idb.r52;

import java.io.File;

public class RenameFileExample {

    public static void main(String[] args) {

        File oldfile = new File("d:/a.doc");
        File newfile = new File("d:\\ab.doc");

        if (oldfile.renameTo(newfile)) {
            System.out.println("Rename succesful");
        } else {
            System.out.println("Rename failed");
        }

    }
}
