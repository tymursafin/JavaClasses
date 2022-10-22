package Class21;

public class Degree {
    public static void main(String[] args) {
        Degree obj1 = new Degree();
        obj1.getPrerequisite();
        Bachelors obj2 = new Bachelors();
        obj2.getPrerequisite();
        Masters obj3 = new Masters();
        obj3.getPrerequisite();
    }

    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }

    static class Bachelors extends Degree {
    }

    static class Masters extends Degree {
        @Override
        void getPrerequisite() {
            System.out.println("Congratulations!");
        }
    }
}
