package Java_new.Java_Collections.LinkedhashSet_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class AllInLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> Nitin = new LinkedHashMap<>();
        //adding
        Nitin.put("Apple", 1.0);
        Nitin.put("Banana", 2.0);
        Nitin.put("Ccat", 3.0);
        Nitin.put("Dog", 4.0);
        System.out.println("Initial Nitin: " + Nitin);
//////// updating
        if (Nitin.containsKey("Banana")) {
            Nitin.put("Banana", 4.089);
            System.out.println("Updated  Banana price"+Nitin);
        }
        //remove
        Nitin.remove("Apple");
       System.out.println("Removed Apple price"+Nitin);

       //display all info

        System.out.println("Final stage");
        for (Map.Entry<String, Double> entry : Nitin.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Price: $" + entry.getValue());

        }


        }
}
