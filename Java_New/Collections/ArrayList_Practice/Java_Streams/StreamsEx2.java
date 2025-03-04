package Java_new.Java_Streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class person{
    String name;
    Integer age;
    Integer id;


    public person(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public Integer getId(){
        return id;
    }
}
public class StreamsEx2 {
    public static void main(String[] args) {
        List<person> list = new ArrayList<>();
        list.add(new person("Nitin", 20, 1855));
        list.add(new person("Raj", 35, 1856));
        list.add(new person("Ravi", 28, 1857));
        list.add(new person("Suresh", 23, 1858));
        Stream<person> Stream = list.stream();
        Stream.map(p->p.getAge()).filter(i->i>25).forEach(System.out::println);

    }
}

