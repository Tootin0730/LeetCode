import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> result = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                result.push(c);
            } else if (c == ')' && !result.isEmpty() && result.peek() == '(') {
                result.pop();
            } else if (c == '}' && !result.isEmpty() && result.peek() == '{') {
                result.pop();
            } else if (c == ']' && !result.isEmpty() && result.peek() == '[') {
                result.pop();
            } else {
                return false;
            }
        }
        return result.isEmpty();
    }
}
