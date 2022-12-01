package repls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Repl217CountDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);

        System.out.println(countDublicates(list));
    }

    static int countDublicates(List<Integer> numbers) {

        HashSet<Integer> duplicates = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for (Integer num : numbers) {
            if (!set1.add(num)) {
                duplicates.add(num);
            }
        }


//        for(int i = 0; i < numbers.size(); i++){
//            for (int j = i+1; j < numbers.size(); j++) {
//                if(numbers.get(i) == numbers.get(j)){
//                    duplicates.add(numbers.get(i));
//                }
//            }
//        }
        return duplicates.size();
    }
}
