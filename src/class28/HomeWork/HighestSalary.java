package class28.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class HighestSalary {
    public static void main(String[] args) {
        //Create a Map that will store Employee name and salary.
        Map<String, Integer> employee = new HashMap<>();
        employee.put("Mary", 120000);
        employee.put("John", 160000);
        employee.put("Bob", 180000);
        employee.put("Frank", 130000);
        employee.put("Katy", 150000);
        // Write a logic to retrieve an employee who gets the highest salary.
        // Output should be in the below format
        //John Smith=$100000
        var iterator = employee.entrySet().iterator();
        Integer highestSalary = 0;
        String name = "";
        while (iterator.hasNext()) {
            var entry = iterator.next();
            var salary = entry.getValue();
            if (salary > highestSalary) {
                highestSalary = salary;
                name = entry.getKey();
            }
        }
        System.out.println(name + "=$" + highestSalary);

    }
}
