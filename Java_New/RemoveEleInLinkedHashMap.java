package Java_new;

import java.util.LinkedHashMap;

public class RemoveEleInLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        System.out.println(" "+map);
        map.remove(1);
        System.out.println(" "+map);
    }
}
