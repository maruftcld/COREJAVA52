package org.idb.r52;


class Fruit{
    void fruitType(){
        System.out.println("fruitType");
    }
}

class Apple extends Fruit{}

class Pineapple extends Fruit{}


public class CovariantReturn {
    
    public CovariantReturn(Fruit f) {
        
    }
    
    public Fruit getFruit(){
        return new Pineapple(); //covariant
    }
    
    public Apple getApple(){
        return new Apple();
    }
    
    public Pineapple getPineapple(){
        return new Pineapple();
    }
    
    
    public static void main(String[] args) {
        CovariantReturn cr = new CovariantReturn(new Apple());
    }
}