package Class28.HomeWork;

import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;

public class Person {
    //Create a Person class with following private fields: name, lastName, age, salary.
    private String name;
    private String lastName;
    private int age;
    private double salary;
    //Inside the class also create a method to print user details.
    public Person(String name, String lastName, int age, double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("lastName='" + lastName + "'")
                .add("age=" + age)
                .add("salary=" + salary)
                .toString();
    }
}

class Test{
    public static void main(String[] args) {
        //In Test Class create a Map that will store key in ascending order.
        Map<Integer, Person> employee = new TreeMap<>();
        //In that map store personId and a Person Object.
        //Variables should be initialized through constructor.
        employee.put(951, new Person("Alex", "Green", 35, 120000));
        employee.put(789, new Person("Tom", "Brown", 34, 110000));
        employee.put(369, new Person("John", "Black", 33, 140000));
        employee.put(852, new Person("Mary", "Grey", 32, 180000));
        employee.put(753, new Person("Rob", "White", 31, 150000));
        //Print each object details.
        employee.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}
