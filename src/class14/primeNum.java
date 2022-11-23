package class14;

public class primeNum {
    //Write a method to return whether given number is prime or not?
    public static void main(String[] args) {
        primeNumber(-1);

    }
    static void primeNumber(int num){
        if(num == 2 || num == 3 || num == 5){
            System.out.println("number is prime");
        } else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
            System.out.println("number is not prime");
        }else if (num <= 1){
            System.out.println("incorrect input");
        }else{
            System.out.println("number is prime");
        }
    }
}
