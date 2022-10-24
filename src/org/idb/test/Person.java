package org.idb.test;

public class Person {
    int a = 10;
    private Person() {
    }
    
    static Person getPerson(){ //factory method
        return new Person();
    }
    
    
}

class TestClass{
    public static void main(String[] args) {
        Person p = Person.getPerson();
        System.out.println(p.a);
    }
}