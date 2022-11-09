package org.idb.r52;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", "Mr. A");
        map.put("b", "Mr. B");
        map.put("c", "Mr. C");
        
        //System.out.println(map.get("a"));
        Set set = map.keySet();
        //System.out.println(set);
        
        Map<String, Integer> maps = new HashMap<>();
        maps.put("A", 1);
        maps.put("A", 1);
        maps.put("A", 1);
        maps.put("A", 1);
        maps.put("B", 2);
        maps.put("C", 3);
        maps.put("D", 4);
       
        
        Set<String> s = maps.keySet();
        for (String key : s) {
            System.out.println(key + " " + maps.get(key));
        }
        System.out.println(maps.containsKey("F"));
        System.out.println(maps.containsValue(7));
        if(maps.containsKey("B")){
            System.out.println(maps.get("B"));
        }
        
        
        Set<String> ss = new HashSet<>();
        ss.add("A");
        ss.add("A");
        ss.add("A");
        ss.add("A");
        for (String s1 : ss) {
            System.out.println(s1);
        }
        
        Map<Integer, List<String>> m = new HashMap<>();
        m.put(1, new ArrayList<String>());/////
        List<String> list = new ArrayList<String>();
        list.add("ABC");
        list.add("EDF");
        list.add("SRY");
        m.put(2, list);/////
        for (Integer i : m.keySet()) {
           List<String> ls = m.get(i);
            for (String l : ls) {
                System.out.println(l);
            }
        }
        System.out.println(m);
        int[] ar = {1, 2, 3, 4};
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        for (int x :ar){
            System.out.println(x);
        }
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        
        for (int[] arr1 : arr) {
            for (int b : arr1) {
                System.out.println(b);
            }
        }
        
    }
    
        Set abc(){
            return new HashSet();
        }
}