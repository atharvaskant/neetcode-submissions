class MinStack {
        Stack<Integer> minStack;
    Stack<Integer> stack;

    public MinStack() {

        this.stack = new Stack<>();
        this.minStack = new Stack<>();

    }

    public void push(int val) {

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.add(val);
        }
        stack.add(val);

    }

    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}