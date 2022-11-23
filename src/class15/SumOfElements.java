package class15;

/*Create a method that will accept an array as parameters
and will return a sum of all elements from that array.
Method should be visible only within same package
and accessible by the creating an instance of the class.
 */
public class SumOfElements {
    int sumOfElementsInArray(int[] arr) {
        int sum = 0;
        for (int j : arr) sum += j;
        return sum;
    }

    public static void main(String[] args) {
        SumOfElements obj = new SumOfElements();
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(obj.sumOfElementsInArray(arr));

        ReverseStringMethod obj1 = new ReverseStringMethod();
        String text = "Process finished with exit code 0";
        System.out.println(obj1.reverseString(text));
    }
}
