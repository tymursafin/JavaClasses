package Class14;

public class evenOrOdd {
    //Create a method that will take a number and prints whether the number is even or odd.
    public static void main(String[] args) {
        evenOrOdd(15);

    }
    static void evenOrOdd(int num){
        if(num % 2 ==0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }
}
