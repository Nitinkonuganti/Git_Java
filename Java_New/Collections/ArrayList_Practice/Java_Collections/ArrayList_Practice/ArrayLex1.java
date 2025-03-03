package Java_new.Java_Collections.ArrayList_Practice;

import java.util.ArrayList;

public class ArrayLex1 {
    class Item{
        String name;
        double price;

        Item(String name, double price){
            this.name = name;
            this.price = price;
        }
        public String toString(){
            return name + " $" + price;
        }
    }
    public class shoppingCart{
        private ArrayList<Item> items = new ArrayList<Item>();
    }



    public static void main(String[] args) {
    }
}
