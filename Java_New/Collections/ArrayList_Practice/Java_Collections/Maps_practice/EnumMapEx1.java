package Java_new.Java_Collections.Maps_practice;
import java.util.EnumMap;
enum Day{
    Monday, Tuesday, wednesday, thursday, friday
}
public class EnumMapEx1 {
    public static void main(String[] args) {
        EnumMap<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.Monday, "Work on java");
        map.put(Day.wednesday, "Team meeting");
        map.put(Day.friday, "reports");

        System.out.println("map: "+map);
        System.out.println("wednesday: "+map.get(Day.wednesday));
        map.remove(Day.friday);
        System.out.println("update "+map);

    }
}
