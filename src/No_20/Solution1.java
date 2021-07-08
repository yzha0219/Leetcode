package No_20;

import java.util.Stack;

public class Solution1 {

    public static void main(String[] args) {
        String s = "()[]{}[";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() == 0)
            return true;
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if (!stack.empty()) {
                    char temp = stack.pop();
                    if (c == ')'){
                        if (temp != '(')
                            return false;
                    } else if (c == ']'){
                        if (temp != '[')
                            return false;
                    } else if (c == '}'){
                        if (temp != '{')
                            return false;
                    }
                } else
                    return false;
            }
        }
        return stack.empty();
    }
}
