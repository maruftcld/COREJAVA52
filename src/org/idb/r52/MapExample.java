package org.idb.r52;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", "Mr. A");
        map.put("b", "Mr. B");
        map.put("c", "Mr. C");
        
        System.out.println(map.get("a"));
    }
}