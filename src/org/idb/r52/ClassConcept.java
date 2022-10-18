package org.idb.r52;

 public class ClassConcept {
    // class is a structure
    String name;
    int ID;
    String batch;
    double result;
    
    int num1;
    int num2;
    int sum;
    
    double processResult(double r){
        result = r;
        return result;
    }
    
    void doSum(int data1, int data2){
        //int sum = data1 + data2;
        num1 = data1;
        num2 = data2;
        sum = num1 + num2;
        System.out.println("Sum is " + (num1 + num2));
    }
    
    int doSum1(int data1, int data2){
        num1 = data1;
        num2 = data2;
        sum = num1 + num2;
        return sum;
    }
    
    static void abc(){};
    public static void main(String[] args) {
        //new ClassConcept().doSum(15, 16);
        //new ClassConcept().doSum(20, 21);
        
        int a = new ClassConcept().doSum1(20, 21);
        System.out.println("Sum is " + a);
        abc();
    }
}

class A{}
class B{}
class C{}