package repls;

import java.util.ArrayList;
import java.util.List;

public class Repl219CountOnlyPrefixes {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("steve");
        namesList.add("stevens");
        namesList.add("danny");
        namesList.add("steves");
        namesList.add("dan");
        namesList.add("john");
        namesList.add("johny");
        namesList.add("joe");
        namesList.add("alex");
        namesList.add("alexander");

        List<String> queryNames = new ArrayList<>();
        queryNames.add("steve");
        queryNames.add("alex");
        queryNames.add("joe");
        queryNames.add("john");
        queryNames.add("dan");

        System.out.println(countOnlyPrefixes(namesList, queryNames));

    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {
        List<Integer> prefixes = new ArrayList<>();

        for (String queryName : query) {
            int count = 0;
            for (String listName : names) {
                if (listName.startsWith(queryName) && !listName.equals(queryName)) {
                    count++;
                }
            }
            prefixes.add(count);
        }
        return prefixes;
    }
}
