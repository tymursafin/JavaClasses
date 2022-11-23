package class28.HomeWork;

import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        //Create a collection of integers in which you can keep duplicates.
        //Write a logic to find sum of all integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(12);
        numbers.add(20);

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }
}
