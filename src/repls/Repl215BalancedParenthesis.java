package repls;

import java.util.Stack;

public class Repl215BalancedParenthesis {

    public static boolean isBalanced(String s){
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '('){
                stack1.push(c);
            }else{
                stack2.push(c);
            }
        }
        return stack1.size() == stack2.size();
    }

    public static void main(String[] args) {

        System.out.println(isBalanced(")))()(()()))())((())))())))())))(()"));

    }
}
