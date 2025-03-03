package Java_new.Java_Collections.Sets_practice.Treeset_practice;

import java.util.TreeSet;

public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet();
        ts.add("Nitin");
        ts.add("A");
        ts.add("R");
        ts.add("N");
        ts.add("Nitin");
        System.out.println("Treeset elements"+ts);
        ts.remove("Nitin");
        System.out.println("After removing Nitin"+ts);
        System.out.println("Iterating treeset elements");
        for(String s : ts){
            System.out.println(s);
        }
    }
}
