package Class22;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student stu:students) {
            stu.study();
        }
        SyntaxStudent.studyJava();
        CollegeStudent.studyMath();
        SchoolStudent.studyPhysics();
    }
}
