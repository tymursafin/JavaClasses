package repls;

public class Repl225reverseInteger {
    public static void main(String[] args) {

        System.out.println(reverseInteger(1001));

    }
    public  static int reverseInteger(int N){

        StringBuilder number = new StringBuilder(String.valueOf(N));
        return Integer.parseInt(number.reverse().toString());

    }
}
