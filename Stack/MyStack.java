class MyStack {

    private int[] stack;
    private int top;

    MyStack(int size) {
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = stack[top];
        top--;

        return value;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
    public static void main(String[] args) {

        MyStack s = new MyStack(3);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        System.out.println("Top element: " + s.peek());

        System.out.println("Is stack empty? " + s.isEmpty());
    }
}
