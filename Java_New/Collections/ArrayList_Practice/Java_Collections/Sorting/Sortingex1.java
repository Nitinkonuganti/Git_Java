package Java_new.Java_Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sortingex1 {
    public static void main(String[] args) {
        ArrayList<String> Cars = new ArrayList<String>();

        Cars.add("Audi");
        Cars.add("BMW");
        Cars.add("Volvo");
        Cars.add("Ford");
        Cars.add("Honda");

        Collections.sort(Cars);
            for(String i : Cars){
                System.out.println(i);
            }
        }
    }

