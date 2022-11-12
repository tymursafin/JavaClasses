public class CodeBat {
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public static void main(String[] args) {

        var processedString = CodeBat.missingChar("window", 3);
        System.out.println(processedString);
    }
}


