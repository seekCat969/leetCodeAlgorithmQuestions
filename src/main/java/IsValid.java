import java.util.*;
import java.util.function.Consumer;

/**
 * 20.有效的括号 Simple
 * */
public class IsValid {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{'){stack.push('}');}
            else if (c == '['){stack.push(']');}
            else if (c == '('){stack.push(')');}
            else if (stack.empty() || stack.pop() != c){return false;}
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        System.out.println(isValid.isValid("{}(){}"));
    }
}
