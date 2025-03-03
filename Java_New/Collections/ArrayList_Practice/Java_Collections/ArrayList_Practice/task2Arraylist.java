package Java_new.Java_Collections.ArrayList_Practice;

import java.util.ArrayList;

public class task2Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("newyork");
        cities.add("mumbai");
        cities.add("plovdiv");
        cities.add("Hyderabad");
        System.out.println("Original ArrayList: " + cities);

        cities.remove(3);
        System.out.println("After removing the city in index 3" + cities);

        cities.add(0, "Banglore");
        System.out.println("After adding the city in beginning" + cities);

        cities.set(1,"chennai");
        System.out.println("After updating the city in index 1"+ cities);

        System.out.println("Cities in the arrlist");
        for(String city : cities){
            System.out.println(city);
        }

    }
}
