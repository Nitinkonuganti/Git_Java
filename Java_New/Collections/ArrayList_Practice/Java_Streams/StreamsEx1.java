package Java_new.Java_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student1{
    int id;
    String name;
    int marks;

    public Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return id + " " + name + " " + marks;
    }
}

public class StreamsEx1 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, "Nitin", 80));
        list.add(new Student1(2, "Raj", 90));
        list.add(new Student1(3, "Ravi", 70));
        list.add(new Student1(4, "Suresh", 60));
        System.out.println(list);
        Stream<Student1> stream = list.stream();
        stream.forEach(System.out::println);
    }

}
