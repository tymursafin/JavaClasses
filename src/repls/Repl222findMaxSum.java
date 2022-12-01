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
        list.add(10);
        System.out.println(findMaxSum(list));
    }

    public static int findMaxSum(List<Integer> list) {
        Collections.sort(list);
        int firstLargest = list.get(list.size()-1);
        int secondLargest = list.get(list.size()-2);
        return firstLargest + secondLargest;
    }
}
