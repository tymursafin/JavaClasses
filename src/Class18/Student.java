package Class18;

public class Student {
    String name;
    String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + "\nAddress: " + address);
    }

    public static void main(String[] args) {
        new Student("Tymur", "New-York, 17 Yellow str").displayInfo();
    }
}
