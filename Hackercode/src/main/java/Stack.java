import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(isBalanced(in.next()));
        }
        in.close();
    }
    static boolean isBalanced(String parentheses) {
        java.util.Stack<Character> stack = new java.util.Stack<Character>();
        for (int i = 0; i < parentheses.length(); i++) {
            char ch = parentheses.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (stack.empty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
                        || (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
