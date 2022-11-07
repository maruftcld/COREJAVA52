package org.idb.r52;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", "Mr. A");
        map.put("b", "Mr. B");
        map.put("c", "Mr. C");
        
        System.out.println(map.get("a"));
        Set set = map.entrySet();
        System.out.println(set);
    }
}