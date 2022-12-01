package repls;

public class Repl220FormatTheString {

//    input ["00-44   48 555555"]
//
//    output ["004-448-555-555"]
//
//    input ["00-44   48 555"]
//
//    output["004-448-555"]
//
//    input ["00-44  #$% 48 55"]
//
//    output ["004-448-55"]

    public static void main(String[] args) {

        String str = "00-44  #$% 48 55";

        System.out.println(formatString(str));

    }

    public static String formatString(String S) {

        S = S.replaceAll("\\s", "")
                .replaceAll("-", "")
                .replaceAll("[^0-9]", "");
        String result = "";
        for (int i = 2; i < S.length(); i++) {
            if (i % 3 == 0) {
                result += S.charAt(i)+'-';
            }else{
                result+=S.charAt(i);
            }

        }
        return result;
    }
}
