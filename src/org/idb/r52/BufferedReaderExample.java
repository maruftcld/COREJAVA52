package org.idb.r52;

import java.io.*;
import java.util.stream.Stream;

public class BufferedReaderExample {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("F:\\test.txt"));
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println(e);
            //System.err.println(e);
        }

    }

}
