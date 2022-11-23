package class28.HomeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BestBuyStore {
    public static void main(String[] args) {
        //Create a map of Best Buy store.
        Map<Integer, String> items = new HashMap<>();
        // Place item id and item name into it.
        // Example (7664847 = Printer, 7879885= TV etc )
        items.put(123, "Printer");
        items.put(234, "Tv");
        items.put(345, "Fridge");
        items.put(456, "Microwave");
        items.put(567, "Laptop");
        items.put(789, "Keyboard");
        items.put(890, "Mouse");
        //Retrieve all keys and values from a Best Buy map using EntrySet.

        Iterator<Map.Entry<Integer, String>> iterator = items.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            var key = entry.getKey();
            var value = entry.getValue();
            System.out.println(key + " :: " + value);
        }
    }
}
