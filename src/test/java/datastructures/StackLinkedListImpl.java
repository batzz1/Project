package datastructures;

public class StackLinkedListImpl {

    Node head;

    class Node {
        Node next;
        int value;
    }

    public StackLinkedListImpl() {
        head = null;
    }

    public void push(int value) {
        Node nextNode = head;
        head = new Node();
        head.value = value;
        System.out.printf("Pushed " + value + " to stack \n");
        head.next = nextNode;
    }

    public int pop() {
        if (head == null) {
            System.out.println("Stack is empty");
        }
        int value = head.value;
        head = head.next;
        System.out.printf("Popped " + value + " from stack \n");
        return value;
    }

    public static void main(String[] args) {
        StackLinkedListImpl list = new StackLinkedListImpl();
        list.push(10);
        list.push(20);
        list.push(30);
        list.pop();
        list.push(10);
        list.push(10);
        list.push(10);
        list.push(10);
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();


    }
}
