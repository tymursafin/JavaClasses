import java.util.HashMap;
import java.util.Map;

public class IterationsThroughMaps {

    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap();
        numbers.put(111, "abc");
        numbers.put(113, "qwe");
        numbers.put(112, "ert");
        numbers.put(998, "fgh");
        numbers.put(979, "dku");
        numbers.put(959, "asd");

        var iterator = numbers.entrySet().iterator();
        while (iterator.hasNext()){
            var entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for(Map.Entry<Integer, String> entry:numbers.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        numbers.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });

    }
}

