package com.syntax.Class12;

public class Class12HW6 {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?

        String word1 = "Prime";
        String word2 = "Optimus";
        System.out.println(word1 + " " + word2);

        word1 = word2 + word1;
        word2 = word1.replace(word2, "");
        word1 = word1.replace(word2,"");
        System.out.println(word1 + " " + word2);
    }
}