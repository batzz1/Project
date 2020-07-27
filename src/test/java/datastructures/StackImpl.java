package datastructures;

public class StackImpl {

    int size;
    int arr[];
    int top;

    public StackImpl(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else return false;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;

        } else return false;
    }

    public int peek() {
        if (!this.isEmpty()) {
            return arr[top];
        } else {
            System.out.printf("Stack is Empty");
            return -1;
        }
    }

    public void push(int element) {
        if (!this.isFull()) {
            top++;
            arr[top] = element;

            System.out.printf("Pushed Element " + element + " to stack\n");
        } else {
            System.out.printf("Stack is Full");
        }
    }

    public int pop() {
        if (!this.isEmpty()) {
            int temp = top;
            top--;
            System.out.println("Popped element " + arr[temp] + " from stack\n");
            return arr[temp];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
