package Java_new.Java_Collections.Maps_practice;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Akhil", 1);
        map.put("Bobby", 2);
        map.put("Cat", 3);
        map.put("Dog", 4);
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("Price of Dog: " + map.get("Dog"));

        map.remove("Cat");
        System.out.println("After removing"+map);

        LinkedHashMap<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.putAll(map);

        accessOrderMap.get("Akhil");

        System.out.println("Access Order Map: " + accessOrderMap);

    }
}
