package Class26.StudentHW;

public class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        setName(name);
        setStudentId(studentId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name;  }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
