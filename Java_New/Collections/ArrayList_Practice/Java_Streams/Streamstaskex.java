package Java_new.Java_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product {
    String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + " - Price: " + price + ", Rating: " + rating;
    }
}

public class Streamstaskex {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 100, 4.5));
        products.add(new Product("Dell", 150, 3.5));
        products.add(new Product("Samsung", 120, 5.0));
        products.add(new Product("Hp", 180, 4.0));
        products.add(new Product("Lenovo", 160, 4.5));
        products.add(new Product("Asus", 140, 3.5));

        products.sort(Comparator
                .comparingDouble(Product::getPrice)
                .thenComparing(Comparator.comparingDouble(Product::getRating).reversed()));

        System.out.println("Sorted Products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
