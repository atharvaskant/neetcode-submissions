class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            // If the token is an operator (+, -, *, /)
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int op1 = stack.pop(); // right operand
                int op2 = stack.pop(); // left operand
                int result = 0;
                
                switch (s) {
                    case "+": 
                        result = op2 + op1; 
                        break;
                    case "-": 
                        result = op2 - op1; 
                        break;
                    case "*": 
                        result = op2 * op1; 
                        break;
                    case "/": 
                        result = op2 / op1; 
                        break;
                }
                stack.add(result);
            } else {
                // It's a number (can be positive or negative)
                stack.add(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
    
}
