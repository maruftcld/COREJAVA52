package org.idb.r52;

import jdk.nashorn.internal.codegen.ObjectClassGenerator;


class Faluda {
    String color;
    int qty;
}
class Icecream {
    String type;
    double price;
}

public class ClassTypeArray {
    public static void main(String[] args) {
        Faluda f1 = new Faluda();
        f1.color = "red";
        f1.qty = 5000;
        Faluda f2 = new Faluda();
        f2.color = "green";
        f2.qty = 1000;
        Faluda f3 = new Faluda();
        f3.color = "neel";
        f3.qty = 2100;
        
        Faluda[] faludas = new Faluda[3];
        faludas[0] = f1;
        faludas[1] = f2;
        faludas[2] = f3;
        
        for (int i = 0; i < faludas.length; i++) {
            System.out.println(faludas[i].color); 
       }
        
        
        Object[] objs = new Object[2];
        objs[0] =  f1;
        objs[1] =  new Icecream();
        
        for (int i = 0; i < objs.length; i++) {
            if(objs[i].getClass().getSimpleName().equals("Faluda")){
                Faluda f = (Faluda) objs[i];
                System.err.println(f.color);
            }else if(objs[i].getClass().getSimpleName().equals("Icecream")){
                Icecream ic = (Icecream) objs[i];
                System.err.println(ic.price);
            }
            
            System.out.println(objs[i].getClass().getSimpleName());
        }
    }
}