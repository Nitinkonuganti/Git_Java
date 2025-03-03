package Java_new.Java_Collections.Maps_practice;

import java.util.LinkedHashMap;

public class UpdatingLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(" "+map);
        map.put(1, "Donkey");
        System.out.println("Updated Map"+map);
    }
}
