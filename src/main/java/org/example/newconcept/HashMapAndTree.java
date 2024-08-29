package org.example.newconcept;

import java.util.HashMap;
import java.util.TreeMap;
/**
 * HashMap: you will not get the items in sorted order.
 * in Tree map you will get the item in sorted order.
 * Hashmap:O(1)
 *TreeMap:O(log n)
 */

public class HashMapAndTree {
    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Apple", 1);
//        map.put("Banana", 2);
//        map.put("Orange", 3);
//
//        System.out.println("HashMap: " + map);

//        TreeMap<String, Integer> map = new TreeMap<>();
//        map.put("Apple", 1);
//        map.put("Banana", 2);
//        map.put("Orange", 3);
//        map.put("AOrange", 4);
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1,"test1");
        map.put(0,"test1");
        map.put(3,"test1");
        map.put(2,"test1");


        System.out.println("TreeMap: " + map);

    }
}
