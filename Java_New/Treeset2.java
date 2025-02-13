package Java_new;

import java.util.TreeSet;

public class Treeset2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(3);
        ts.add(4);
        System.out.println("Treeset"+ts);

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(5);
        ts2.addAll(ts);
        System.out.println("NEWTreeset"+ts2);
    }
}
