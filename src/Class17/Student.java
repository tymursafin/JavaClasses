package Class17;

public class Student {
    private String name;
    private int grade1;
    private int grade2;
    private int grade3;

    public Student(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    public void getAvarageGrade(){
        int avarageGrade = (grade1+grade2+grade3)/3;
        System.out.println("The avarage grade of student " + name + " is " + avarageGrade);
    }
}
