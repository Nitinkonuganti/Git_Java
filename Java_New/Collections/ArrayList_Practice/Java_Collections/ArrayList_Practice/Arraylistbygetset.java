package Java_new.Java_Collections.ArrayList_Practice;

import java.util.ArrayList;

public class Arraylistbygetset {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Elements in list: " + list.get(2));
        list.set(1, "E");
        System.out.println("Update array in list: " + list);
        System.out.println("Elements in index after update: " + list.get(1));
    }
}
