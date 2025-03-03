package Java_new.Java_Collections.Maps_practice;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        /// fast retrivals:- insertions, deletions are very fast O(1).
        map.put("Akhil", 1);
        map.put("Bobby", 2);
        map.put("Nitin", 3);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
