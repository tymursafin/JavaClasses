package Class17;

public class Person {
    private String name;
    private String publc;
    private int privt;
    private char deflt;
    private double protctd;

    public Person(String name, String publc) {
        this.name = name;
        this.publc = publc;
    }
    private Person(String name, int privt) {
        this.name = name;
        this.privt = privt;
    }
    Person(String name, char deflt) {
        this.name = name;
        this.deflt = deflt;
    }

    protected Person(String name, double protctd) {
        this.name = name;
        this.protctd = protctd;
    }

    public static void main(String[] args) {
        Person obj = new Person("Tymur", 33);
    }
}
