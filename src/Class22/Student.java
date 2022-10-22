package Class22;

public class Student {


    public void study() {
        System.out.println("Student studying");
    }
}

class SyntaxStudent extends Student {

    @Override
    public void study() {
        System.out.println("SyntaxStudent studying");
    }

    public static void studyJava() {
        System.out.println("SyntaxStudent studying Java");
    }
}

class CollegeStudent extends Student {
    @Override
    public void study() {
        System.out.println("CollegeStudent studying");
    }

    public static void studyMath() {
        System.out.println("CollegeStudent studying Math");
    }
}

class SchoolStudent extends Student {
    @Override
    public void study() {
        System.out.println("SchoolStudent studying");
    }

    public static void studyPhysics() {
        System.out.println("SchoolStudent studying Physics");
    }
}

