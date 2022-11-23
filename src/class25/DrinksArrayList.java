package class25;

import java.util.ArrayList;

public class DrinksArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Margarita");
        drinks.add("Cosmopolitan");
        drinks.add("Bloody Mary");
        drinks.add("Daiquiri");
        drinks.add("Martini");
        drinks.add("Mojito");
        drinks.add("Manhattan");
        drinks.add("Aperol Spritz");
        drinks.add("Irish Coffee");
        drinks.add("Gin & Tonic");
        drinks.add("Long Island Iced Tea");

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}
