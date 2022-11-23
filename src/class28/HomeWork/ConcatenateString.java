package class28.HomeWork;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConcatenateString {
    public static void main(String[] args) {
        //Create the collection that will store single uniques Objects of a String type in which order is preserved.
        //Write a logic to concatenate all string from the collection.
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Write");
        stringSet.add("a");
        stringSet.add("logic");
        stringSet.add("to");
        stringSet.add("concatenate");
        stringSet.add("all");
        stringSet.add("string");
        stringSet.add("from");
        stringSet.add("the");
        stringSet.add("collection");

        String text= "";
        for(String word:stringSet){
            text += word;
        }
        System.out.println(text);
    }
}
