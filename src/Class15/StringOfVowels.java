package Class15;

public class StringOfVowels {
    /*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */
    private static String vowelsOnly(String text) {
        return text.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        String text = "Process finished with exit code 0";
        System.out.println(vowelsOnly(text));
    }
}
