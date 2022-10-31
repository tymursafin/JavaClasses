package Class25;

import java.util.ArrayList;

public class EvenNumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> evenNums = new ArrayList<>();
        for (int i = 0; i <= 500; i++) {
            if (i % 2 == 0) {
                evenNums.add(i);
            }
        }

        evenNums.removeIf(num -> num % 5 == 0);
        System.out.println(evenNums);
    }
}
