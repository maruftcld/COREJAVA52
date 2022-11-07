package org.idb.r52;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class GenericsConcept {
    
    
    public List<Car> getEmployees(Car c){
        List<Car> cars = new ArrayList<>();
        Car c1 = new Car();
        c1.name = "Tesla";
        cars.add(c1);
        
        //return new ArrayList();
        //return new Vector();
        return cars;
    }
    
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("hi");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.println(next);
        }
        for (StringTokenizer stringTokenizer = new StringTokenizer(list.get(0)); stringTokenizer.hasMoreTokens();) {
            String token = stringTokenizer.nextToken();
            System.out.println(token);
        }
        
        Set<Object> set = new HashSet<Object>();
        set.add("s1");
        set.add("S1");
        set.add("s2");
        set.add("s3");
        set.add(new Object());
        set.add(new Object());
        set.add(new Object());
        set.add(new Object());
        set.add(new Object());
        set.add(new String());
        set.add(new String());
        set.add(new String());
        set.add(new String());
        
        for (Iterator<Object> iterator = set.iterator(); iterator.hasNext();) {
            String next = iterator.next().toString();
            System.out.println(next);
        }
        
    
    }
}