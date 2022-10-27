package org.idb.r52;

// model, entity, pojo
public class EncapsulationExample {
    private int age;
    private String name;
    private double salary;
    private String address;
    
    public int getAge(){ // to get the value of private property
        return age;
    }
    public void setAge(int age){ // to set the value of private property
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
}

class TestCapsule{
    public static void main(String[] args) {
        EncapsulationExample ee = new EncapsulationExample();
        ee.setAge(12);   
        
        System.out.println(ee.getAge());
        EncapsulationExample ee2 = new EncapsulationExample();
        System.out.println(ee2.getAge());
    }
}