package repls;

public class Repl224removeConsecutiveDuplicates {
    public static void main(String[] args) {

        String str = "aabbcca";
        System.out.println(removeConsecutiveDuplicates(str));
    }

    public static String removeConsecutiveDuplicates(String input) {

        StringBuilder sb = new StringBuilder(input);
        for (int i = sb.length()-1; i > 0; i--) {
            if(sb.charAt(i) == sb.charAt(i-1)){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}

