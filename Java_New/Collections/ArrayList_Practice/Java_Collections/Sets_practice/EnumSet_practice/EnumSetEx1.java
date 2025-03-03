package Java_new.Java_Collections.Sets_practice.EnumSet_practice;

import java.util.EnumSet;

enum Permission {
    READ, WRITE, EXECUTE, DELETE;
}

public class EnumSetEx1 {
    public static void main(String[] args) {
        EnumSet<Permission> admin = EnumSet.allOf(Permission.class);
        EnumSet<Permission> editor = EnumSet.of(Permission.READ, Permission.WRITE);
        EnumSet<Permission> viewer = EnumSet.of(Permission.READ);
        EnumSet<Permission> guest = EnumSet.noneOf(Permission.class);

        System.out.println("Admin: " + admin);
        System.out.println("Editor: " + editor);
        System.out.println("Viewer: " + viewer);
        System.out.println("Guest: " + guest);
    }
}
