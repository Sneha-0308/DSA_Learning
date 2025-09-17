package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ImmutableCollection {
    public static void main(String[] args) {
        List<String> fruits=List.of("Apple","Mango","banana");
        // fruits.add("Orange");  // ❌ throws UnsupportedOperationException
        // fruits.set(0, "Mango"); // ❌ not allowed
        System.out.println(fruits); // ✅ [Apple, Banana, Cherry]

        Map<Integer, String> map = Map.of(1, "One", 2, "Two", 3, "Three");
//        map.put(4,"Four"); //❌ throws UnsupportedOperationException
        System.out.println(map); // {1=One, 2=Two, 3=Three}

    }
}
