package org.idb.r52;

import java.lang.reflect.Field;

class Person {
    String name = "";
    int age = 1;
    static int roll = 5;
}

public class DotClassExample {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        Person p = new Person();
        System.out.println(p.age);
        
       Person pp = Person.class.newInstance();
       System.out.println(pp.age);
       
       Class.forName("org.idb.r52.Person").newInstance();
        
        
//        Field[] f = Person.class.getDeclaredFields();
//        Field[] ff = Class.forName("org.idb.r52.Person").getDeclaredFields();
//        for (Field f1 : ff) {
//            System.out.println(f1.getName());
//        }
        
    }
}