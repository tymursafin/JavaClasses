package Class25;

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

        for (String drink : drinks) {
            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(drinks.indexOf(drink), "water");
            }
        }
        System.out.println(drinks);
    }
}
