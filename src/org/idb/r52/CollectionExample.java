package org.idb.r52;

import java.util.ArrayList;
import java.util.List;


class Cellphone {
    private String name;
    private String model;
    private double price;
    private int qty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    

}

public class CollectionExample {
    public static void main(String[] args) {
        int a = 10;
        Integer i = new Integer("10");
        i = a;
        a = i;
                
        Cellphone cp = new Cellphone();
        cp.setName("Samsung");
        cp.setModel("720");
        cp.setPrice(15242.215);
        cp.setQty(20);
        
        Cellphone cp1 = new Cellphone();
        cp1.setName("Motorolla");
        cp1.setModel("6746");
        cp1.setPrice(15242.215);
        cp1.setQty(20);
        
        Cellphone cp2 = new Cellphone();
        cp2.setName("Nokia");
        cp2.setModel("6745");
        cp2.setPrice(15242.215);
        cp2.setQty(20);
        
        /* ########################## List ##################### */
        List list = new ArrayList();
        System.err.println(list.isEmpty());
        list.add(1);
        list.add(new Integer("10")); //integer
        list.add(new Double(20.20)); //double
        list.add("Hello List"); //string
        list.add(String.valueOf("Hello")); //string
        list.add(cp); //class type
        list.add(cp1);
        list.add(cp2);
        List cps = new ArrayList();
        cps.add(cp);
        cps.add(cp1);
        cps.add(cp2);
        cps.add(new ArrayList()); 
        list.add(cps);
        list.add(new Object());
        
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(cps));
        System.out.println(list.remove(cps));
        System.out.println(list.size());
        
        
        Object[] listToArray = list.toArray();
        Cellphone cpO = (Cellphone) listToArray[6];
        System.out.println(cpO.getName() + " " + cpO.getPrice());
        
        
    }
}
        
        