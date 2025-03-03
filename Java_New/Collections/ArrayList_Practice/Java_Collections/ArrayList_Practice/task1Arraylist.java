package Java_new.Java_Collections.ArrayList_Practice;

import java.util.ArrayList;

public class task1Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<=10; i++){
            list.add(i * 10);
        }
        System.out.println("original Arraylist" + list);
        list.remove(4);
        System.out.println("after removing 5th element (removed 4)" + list);
        list.set(1, 50);
        System.out.println("after set 2 element    (set 1)" + list);
    }
}
