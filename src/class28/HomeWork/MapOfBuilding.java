package class28.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class MapOfBuilding {

    public static void main(String[] args) {
        // Create a map of a building. Store floor number and it is associated company name.
        //    (Example: 1= Google, 2=Syntax etc..).
        // Insert 7 entries with duplicate keys and values.
        Map<Integer, String> companies = new HashMap<>();
        companies.put(1, "Apple Inc.");
        companies.put(2, "Saudi Aramco");
        companies.put(3, "Microsoft Corp.");
        companies.put(3, "Alphabet Inc.");
        companies.put(5, "Amazon.com Inc.");
        companies.put(6, "Amazon.com Inc.");
        companies.put(7, "NVIDIA Corp.");
        // Check how many entries you have?
        companies.forEach((key, value) -> System.out.println(key + " = " + value));
        // Update company on a 6th floor
        companies.replace(6, "Tesla Inc.");
        // Remove company on the 7th floor
        companies.remove(7);
        // Print your map
        System.out.println();
        companies.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
