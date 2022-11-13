package Class28.HomeWork;

import java.util.Map;
import java.util.TreeMap;

public class CountriesAndCapitals {
    public static void main(String[] args) {
        // Create a map of countries with its capital that will store countries in alphabetical order.
        Map<String, String> countries = new TreeMap<>();
        countries.put("Finland", "Helsinki");
        countries.put("Albania", "Tirana");
        countries.put("Jordan", "Amman");
        countries.put("Iceland", "Reykjavik");
        countries.put("Ukraine", "Kyiv");
        countries.put("Maldives", "Male");
        countries.put("China", "Beijing");
        // Print all keys and values from a country map using for each loop and iterator.
        var iterator1 = countries.entrySet().iterator();
        for(Map.Entry<String, String> entry: countries.entrySet()){
            var country = entry.getKey();
            var capital = entry.getValue();
            System.out.println(country + " = " + capital);
        }
        System.out.println();
        // Print all values from a country map using for each loop and iterator.
        var capitals = countries.values();
        for (String capital : capitals){
            System.out.println(capital);
        }
    }
}
