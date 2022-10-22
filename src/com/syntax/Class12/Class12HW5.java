package com.syntax.Class12;

public class Class12HW5 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not?
        // aba=> true
        // Abbc =>false

        String word = "Radar";
        String wordReversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            wordReversed += word.charAt(i);
        }
        if (word.equalsIgnoreCase(wordReversed)) {
            System.out.println("Word is palindrome");
        } else {
            System.out.println("Word is not palindrome");
        }
    }
}
