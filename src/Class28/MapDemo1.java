package Class28;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("item1", 10.5);
        items.put("item2", 5.5);
        items.put("item3", 20.5);
        items.put("item4", 8.5);
        items.put("item5", 9.5);

        /*var iterator = items.entrySet().iterator();

        while (iterator.hasNext()){
            var item = iterator.next();
            var key = item.getKey();
            var value = item.getValue();
            if(key.contains("3") && value>10){
                iterator.remove();
            }
        }
        System.out.println(items);*/

        items.entrySet().removeIf(entry -> entry.getKey().contains("3") && entry.getValue() > 10);
        System.out.println(items);

    }
}
