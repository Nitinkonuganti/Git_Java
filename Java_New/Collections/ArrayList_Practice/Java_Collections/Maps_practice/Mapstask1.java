package Java_new.Java_Collections.Maps_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapstask1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");

        System.out.println("HashMap Output:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        //Using LinkedHastMap
        Map<Integer, String> llmap = new LinkedHashMap<Integer, String>();
        llmap.put(101, "Alice");
        llmap.put(102, "Bob");
        llmap.put(103, "Charlie");

        System.out.println("LLoutput        \n:");
        for (Map.Entry<Integer, String> entry : llmap.entrySet()) {
            System.out.println("id"+entry.getKey()+ ", Name "  + entry.getValue());
        }


    }
}
