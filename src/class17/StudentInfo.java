package class17;

public class StudentInfo {
    private String name;
    private String surname;
    private String citizenship;
    private int age;
    private int rollNo;
    static String schoolName = "Syntax";

    public StudentInfo() {
    }

    public StudentInfo(String name, String surname, String citizenship, int age, int rollNo) {
        this.name = name;
        this.surname = surname;
        this.citizenship = citizenship;
        this.age = age;
        this.rollNo = rollNo;
        schoolName = schoolName;
    }

    public void printStudentInfo() {
        System.out.println("Student's name: " + name
                + "\nStudent's surname :" + surname
                + "\nStudent's citizenship :" + citizenship
                + "\nStudent's age :" + age
                + "\nStudent of :" + schoolName
                + "\nStudent's rollNo :" + rollNo);
    }
}

