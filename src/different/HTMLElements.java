package different;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HTMLElements {
    public static String checkElements(String str) {
        // Use a regular expression to extract the HTML elements from the string
        Pattern pattern = Pattern.compile("</?[biempdiv]+>");
        Matcher matcher = pattern.matcher(str);
        List<String> elements = new ArrayList<>();
        while (matcher.find()) {
            elements.add(matcher.group());
        }

        // Keep track of the current nesting of elements
        Stack<String> stack = new Stack<>();

        // Loop through the elements in the string
        for (String element : elements) {
            // If the element is an opening tag, push it onto the stack
            if (element.charAt(1) != '/') {
                stack.push(element.substring(1, element.length() - 1));
            } else {
                // If the element is a closing tag, check if it matches the opening tag
                // at the top of the stack. If not, return the opening tag.
                String openTag = stack.pop();
                String closeTag = element.substring(2, element.length() - 1);
                if (!openTag.equals(closeTag)) {
                    return openTag;
                }
            }
        }

        // If the stack is empty at the end, the string is properly formatted
        if (stack.isEmpty()) {
            return "true";
        } else {
            // Otherwise, return the first unmatched opening tag
            return stack.peek();
        }
    }

    public static void main(String[] args) {
        System.out.println(checkElements("<div><b><p>hello</p></b></div>"));
        System.out.println(checkElements("<div><div><b></b></div></p>"));
        System.out.println(checkElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }
}

