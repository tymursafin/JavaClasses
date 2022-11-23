package class25;

import java.util.ArrayList;

public class ArrayListRemoveE {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("room");
        words.add("door");
        words.add("code");
        words.add("chair");
        words.add("frame");
        words.add("table");

        words.removeIf(word -> word.endsWith("e"));
        System.out.println(words);
    }
}
