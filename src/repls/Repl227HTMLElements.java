package repls;

import java.util.Stack;

public class Repl227HTMLElements {
    public static void main(String[] args) {
        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }

    public static String HTMLElements(String str) {

        String[][] TOKENS = {{"b", "<b", "</b"},
                {"i", "<i", "</i"},
                {"em", "<em", "</em"},
                {"p", "<p", "</p"},
                {"div", "<div", "</div"}};

        String[] tags = str.split(">");
        Stack<String> openTagsStack = new Stack<>();

        for (String tag : tags) {
            for (String[] token : TOKENS) {
                if (tag.contains(token[1])) {
                    openTagsStack.push(token[0]);
                } else if (tag.contains(token[2])) {
                    String openTag = openTagsStack.pop();
                    String closeTag = token[0];
                    if (!openTag.equals(closeTag)) {
                        return openTag;
                    }
                }
            }
        }

        if (openTagsStack.isEmpty()) {
            return "true";
        } else {
            return openTagsStack.peek();
        }
    }
}
