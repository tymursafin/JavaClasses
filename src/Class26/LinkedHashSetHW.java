package Class26;

import java.util.LinkedHashSet;

public class LinkedHashSetHW {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Milan");
        cities.add("Bucharest");
        cities.add("Antalya");
        cities.add("Calgary");
        cities.add("Odesa");
        cities.add("Krakow");
        cities.add("Hague");
        var iterator = cities.iterator();
        cities.removeIf(city -> city.startsWith("A"));
        System.out.println(cities);
    }
}
