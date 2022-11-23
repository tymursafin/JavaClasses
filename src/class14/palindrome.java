package class14;

public class palindrome {
    //Create a method that will print whether given String is palindrome or not.
    public static void main(String[] args) {
        palindrome("Bob");

    }
    static void palindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        String wordReversed = sb.reverse().toString();
        if (word.equalsIgnoreCase(wordReversed)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
