package Class24;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Main {
    public static void main(String[] args) {
        Person tymur = new Person("Tymur", "Safin");
        System.out.println("tymur = " + tymur);
        tymur.setFirstName(null);
        System.out.println("tymur = " + tymur);
    }
}

class Car {
    private String make;
    private String model;

    public Car() {
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return new EqualsBuilder().append(getMake(), car.getMake()).append(getModel(), car.getModel()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getMake()).append(getModel()).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("make", make)
                .append("model", model)
                .toString();
    }
}

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer age;

    private Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Integer age) {
        this(firstName, lastName);
        this.age = age;
    }

    public Person(String firstName, String middleName, String lastName, Integer age) {
        this(firstName, lastName, age);
        this.middleName = middleName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            if (firstName.length() > 30) {
                System.err.println("Name too long");
//            logger.atWarning().log("Name too long");
                return;
            }
            if (firstName.isBlank()) {
                System.err.println("Name field can't be blank");
//            logger.atWarning().log("Name field can't be blank");
                return;
            }
            this.firstName = firstName;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (middleName.length() > 30) {
            System.out.println("Name too long");
        } else if (middleName.isEmpty()) {
            System.out.println("No middle name");
        } else {
            this.middleName = middleName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 30) {
            System.out.println("Name too long");
        } else if (lastName.isEmpty()) {
            System.out.println("Name field can't be blank");
        } else {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 1) {
            System.out.println("Age input incorrect.");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("firstName", firstName)
                .append("middleName", middleName)
                .append("lastName", lastName)
                .append("age", age)
                .toString();
    }
}
