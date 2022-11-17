import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class repl209 {
    public static void main(String[] args) {
        // Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList.
        List<Map<String, Object>> dataList = new ArrayList<>();

        // Step 2: Create apple Map<String, Object> and add the below pairs into it.
        Map<String, Object> apple = new LinkedHashMap<>();
        apple.put("Items", "Apple");
        apple.put("Price", 20.00);
        apple.put("Quantity", 10.0);

        // Step 3: Add apple Map to dataList.
        dataList.add(apple);

        // Step 4: Create orange Map<String, Object> and add the below pairs into it.
        Map<String, Object> orange = new LinkedHashMap<>();
        orange.put("Items", "Orange");
        orange.put("Price", 21.99);
        orange.put("Quantity", 10.0);

        // Step 5: Add orangeMap to dataList.
        dataList.add(orange);

        double totalPurchase = 0.0;
        // Step 6: Create a loop from dataList.
        for (Map<String, Object> list : dataList) {
            // **NOTE: as the values are Object you have to do casting properly
            // while retrieving from for each map.**
            double price = (double) list.get("Price");
            double quantity = (double) list.get("Quantity");
            // Step 8: calculate the subtotal of each object.
            double SubTotal = price * quantity;
            // Step 10: Calculate the Sum of subtotal
            // and store is in a variable called totalPurchase.
            totalPurchase += SubTotal;

            // Step 7: Retrieve each Key and store it in a variable.
            for (Map.Entry<String, Object> map : list.entrySet()) {
                String key = map.getKey();
                String value = map.getValue().toString();
                System.out.print(key + ": " + value + " ");
            }

            // Step 9: Print the values of each Iteration
            System.out.println("SubTotal: " + SubTotal);
        }
        // Step 11: After Loop Print the value of Total Purchase.
        System.out.println("Your Purchase total : " + totalPurchase);
    }
}
