package class15;

public class ReverseStringMethod {
    /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public static String reverseString(String text){
        StringBuilder reversedString = new StringBuilder(text);
        return reversedString.reverse().toString();
        // return new StringBuilder(text).reverse().toString();  -->   one line code
    }

    public static void main(String[] args) {
        String text = "Process finished with exit code 0";
        System.out.println(reverseString(text));
    }
}
