package class14;

public class isLarger {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    public static void main(String[] args) {
        isLarger(5,10);
    }
    static void isLarger(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1 + " is larger than " + num2);
        }else{
            System.out.println(num2 + " is larger than " + num1);
        }
    }
}
