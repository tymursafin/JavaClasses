package class26.StudentHW;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("name1", "abc123"));
        students.add(new Student("name2", "abc234"));
        students.add(new Student("name3", "abc345"));
        students.add(new Student("name4", "abc456"));
        students.add(new Student("name5", "abc567"));

        System.out.println(students);
    }
}
