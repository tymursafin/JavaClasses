package Class24;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(5);
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");
        names.add("Name4");
        names.add("Name5");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Name4"));
        System.out.println(names.size());
        System.out.println(names);
    }
}