package class28;

import java.util.HashMap;

public class MapsIterator {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("item1", 10.5);
        items.put("item2", 5.5);
        items.put("item3", 20.5);
        items.put("item4", 8.5);
        items.put("item5", 9.5);

        // I want to remove items whos price is more than 10

        items.values().removeIf(price -> price > 10);
        System.out.println(items);


        /*var it = items.values().iterator();
        while (it.hasNext()){
            Double price = it.next();
            if(price > 10) it.remove();
        }
        System.out.println(items);*/
    }
}
