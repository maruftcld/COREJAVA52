package org.idb.r52;

public class Car {
    String name;
    int modelNo;
    double price;
    

    public Car() {
        System.out.println("constructor");
    }
    
    
    void calculatePrice(){
        System.err.println("The price of " + name + " is " + price);
    }

    public static void main(String[] args) {
        
        Car car1 = new Car(); // object created // memory allocated // anonymous object
        car1.name = "Tesla A";
        car1.price = 750.36;
        car1.calculatePrice();
        car1.calculatePrice();
        car1.calculatePrice();
        car1.calculatePrice();
        
        Car car2 = new Car(); // object created // memory allocated // anonymous object
        car2.name = "Toyota 15R";
        car2.price = 560.0545;
        car2.calculatePrice();
              
        new Car(); // object created // memory allocated // anonymous object
        new Car(); // object created // memory allocated // anonymous object    
    }
}
