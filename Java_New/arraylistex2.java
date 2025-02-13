package Java_new;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistex2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nitin");
        list.add("ravi");
        list.add("king");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
