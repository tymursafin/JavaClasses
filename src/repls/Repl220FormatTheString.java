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

        S = S.replaceAll("[^0-9]", "");
        StringBuilder sb = new StringBuilder(S);

        for (int i = 3; i < sb.length(); i += 4) {
            sb.insert(i, "-");
        }
        return sb.toString();
    }
}
