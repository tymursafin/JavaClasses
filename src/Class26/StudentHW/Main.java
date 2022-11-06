package Class26.StudentHW;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("name1", "abc123");
        Student student2 = new Student("name2", "abc234");
        Student student3 = new Student("name3", "abc345");
        Student student4 = new Student("name4", "abc456");
        Student student5 = new Student("name5", "abc567");

        HashSet<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for(Student student:students){
            System.out.println(student.getName());
        }
    }
}
