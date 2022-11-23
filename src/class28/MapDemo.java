package class28;

import java.util.Collection;
import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("item1", 10.5);
        items.put("item2", 5.5);
        items.put("item3", 20.5);
        items.put("item4", 8.5);
        items.put("item5", 9.5);

        items.forEach((key, value) -> {
            System.out.print(value + " ");
        });

        Collection<Double> prices = items.values();
        for(Double price:prices){
            System.out.println(price + " ");
        }

        var iterator = items.entrySet().iterator();
        while(iterator.hasNext()){
            var entry = iterator.next();
            System.out.print(entry.getValue() + " ");
        }
    }
}
