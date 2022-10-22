package com.syntax.Class12;

public class Class12HW1 {
    public static void main(String[] args) {
        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String sentence = "Create a String that will hold a sentence. Write a program to get a new String without any spaces.";
        System.out.println(sentence.replaceAll(" ", ""));
    }
}
