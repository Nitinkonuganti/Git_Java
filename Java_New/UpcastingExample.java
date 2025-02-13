package Java_new;

class UpcastingJava {
    void sound() {
        System.out.println("makessound");
    }
}

class Dog extends UpcastingJava {
    @Override
    void sound() {
        System.out.println("dog");
    }

    void specificBehaviour() {
        System.out.println("Dog wags with tails");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        UpcastingJava animal = new Dog();
        animal.sound();
    }
}