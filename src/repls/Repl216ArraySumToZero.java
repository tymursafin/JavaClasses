package repls;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl216ArraySumToZero {

//    ArraySumToZero(0) ->{}
//
//    ArraySumToZero(1) ->{0}
//
//    ArraySumToZero(2) ->{-1,1}
//
//    ArraySumToZero(3) ->{1,-1,0}
//
//    ArraySumToZero(4) ->{2,-2,3,-3}

    public static int[] arraySumToZero(int N) {

        ArrayList<Integer> list = new ArrayList<>();
        if (N % 2 != 0) list.add(0);

        for (int i = 1; i <= N / 2; i++) {
            //int a = (int) (Math.random() * 100);
            list.add(i);
            list.add(-i);
        }

        int[] arr = new int[N];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arraySumToZero(11)));
    }
}
