package Java_new.Java_Collections.Maps_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingInLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Iterate
        for (Map.Entry<Integer, String> mapElement : map.entrySet()) {
            Integer key = mapElement.getKey();
            String value = mapElement.getValue();

            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
