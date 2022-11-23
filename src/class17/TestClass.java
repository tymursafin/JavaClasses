package class17;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(" ======== First student ======== ");
        StudentInfo tymur = new StudentInfo("Tymur","Safin", "Ukraine", 30, 8067);
        StudentInfo aider = new StudentInfo();
        tymur.printStudentInfo();
        System.out.println(" ======== Second student ======== ");
        aider.printStudentInfo();

        System.out.println(" ======== Avarage Grade ======== ");
        Student marat = new Student("Marat", 40, 60, 90);
        Student adam = new Student("Adam", 25, 70, 54);
        Student borat = new Student("Borat", 41, 68, 95);
        Student dodo = new Student("Dodo", 15, 100, 55);
        Student polat = new Student("Polat", 79, 69, 58);
        marat.getAvarageGrade();
        adam.getAvarageGrade();
        borat.getAvarageGrade();
        dodo.getAvarageGrade();
        polat.getAvarageGrade();

        System.out.println(" ======== Class Person ======== ");



    }
}
