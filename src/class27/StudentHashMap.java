package class27;

import java.util.TreeMap;

public class StudentHashMap {
    public static void main(String[] args) {
        TreeMap<String, String> students = new TreeMap<>();
        students.put("123", "name1");
        students.put("234", "name2");
        students.put("345", "name3");
        students.put("456", "name4");
        students.put("567", "name5");
        System.out.println(students.values());
    }
}
