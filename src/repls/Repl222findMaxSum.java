package repls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repl222findMaxSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(60);
        System.out.println(findMaxSum(list));
    }

    public static int findMaxSum(List<Integer> list) {
        // sorting in descending order
        Collections.sort(list, Collections.reverseOrder());

        int firstLargest = list.get(0);
        int secondLargest = list.get(1);
        return firstLargest + secondLargest;
    }
}
