package com.syntax.Class12;

public class Class12HW2 {
    public static void main(String[] args) {
        /*Create a String that should be combination of letters, numbers and special characters.
          Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

        String str = "qwertyQWERTY1234567890@#$%^&*{}[]";
        String strProcessed = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(strProcessed.length());
    }
}
