class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i=0; i<s.length(); i++) {
            char t = s.charAt(i);
            if (t == '(' || t == '[' || t == '{') {
                stack.push(t);
            } else if (t == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (t == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (t == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                return false;}
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        
        return true;
    }
}
