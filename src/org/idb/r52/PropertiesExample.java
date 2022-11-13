package org.idb.r52;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesExample {
    
    static String username = "alex";
    static String password = "xyz#";
    
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("user", username);
        prop.setProperty("pass", password);
        
        try {
            prop.store(new FileWriter("users.properties"), "user properties file");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        Properties prop1 = new Properties();
        try {
            prop1.load(new FileReader("users.properties"));
            System.out.println(prop1.getProperty("pass"));;
        } catch (IOException ex) {
        }
        
    }
}