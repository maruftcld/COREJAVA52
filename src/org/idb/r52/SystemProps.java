package org.idb.r52;

import java.util.Enumeration;
import java.util.Properties;

public class SystemProps {
    public static void main(String[] args) {
       Properties prop = System.getProperties();//
       
       
       
        Enumeration e = prop.propertyNames();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.err.println(prop.getProperty("os.name"));;
    }
}