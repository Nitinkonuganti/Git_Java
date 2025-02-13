package Java_new;

abstract class Vehicle {
    private String brand;  // Encapsulation

    public String getBrand(){
        return brand;


    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println(getBrand() + " Car starts with a botton");
    }
}

public class task1oops {
    public static void main(String[] args) {
         Vehicle car = new Car();


        car.setBrand("Toyota");
        car.start();
        car.getBrand();
    }
}
