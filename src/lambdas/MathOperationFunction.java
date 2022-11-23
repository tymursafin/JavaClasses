package lambdas;

public class MathOperationFunction {
    public static void main(String[] args) {
        mathOperation myLambda = (int a, int b) -> a-b;
        System.out.println(myLambda.operation(54, 67));
    }

    interface mathOperation {
        int operation(int a, int b);
    }

}
