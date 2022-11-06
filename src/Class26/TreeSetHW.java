package Class26;

import java.util.TreeSet;

public class TreeSetHW {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Italy");
        countries.add("France");
        countries.add("Afghanistan");
        countries.add("Bangladesh");
        countries.add("Chily");
        countries.add("Peru");
        countries.add("New Zealand");
        countries.add("Japan");

        System.out.println(countries);

        var it = countries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
