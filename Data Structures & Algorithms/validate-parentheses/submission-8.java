class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        for(char ch:s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.add(ch);
            } else {
                if(!stack.isEmpty()) {
                    char top = stack.peek();
                    if ((ch == ')' && top == '(') ||
                            (ch == '}' && top == '{') ||
                            (ch == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
}
