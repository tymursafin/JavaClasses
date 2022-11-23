package class25;

import java.util.ArrayList;

public class EvenNumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> evenNums = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            evenNums.add(i);
        }

        evenNums.removeIf(num ->num %5==0);
        System.out.println(evenNums);
    }
}
