package Class24;

class Test{
    public static void main(String[] args) {
        Person tymur = new Person("Tymur", "", "Safin", 15, "");
        tymur.printInfo();
    }
}

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String carBrand;

    public Person(String name, String midName, String secondName, int age, String car) {
        setFirstName(name);
        setMiddleName(midName);
        setLastName(secondName);
        setAge(age);
        setCarBrand(car);
    }

    void printInfo(){
        System.out.println("Name: " + firstName +
                "\nMiddle name: " + middleName +
                "\nLast name: " + lastName +
                "\nAge: " + age +
                "\nCar brand: " + carBrand);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 30) {
            System.out.println("Name too long");
        } else if (firstName.isEmpty()) {
            System.out.println("Name field can't be blank");
        }else{
            this.firstName = firstName;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (firstName.length() > 30) {
            System.out.println("Name too long");
        } else if (firstName.isEmpty()) {
            System.out.println("No middle name");
        }else{
            this.middleName = middleName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (firstName.length() > 30) {
            System.out.println("Name too long");
        } else if (firstName.isEmpty()) {
            System.out.println("Name field can't be blank");
        }else {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 120 || age < 1){
            System.out.println("Age input incorrect.");
        }else {
            this.age = age;
        }
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        if(carBrand.isEmpty()){
            System.out.println("no car");
        }else {
            this.carBrand = carBrand;
        }
    }
}
