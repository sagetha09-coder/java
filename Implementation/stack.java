import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}
class StackLL {
    Node top;
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }
    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL stack = new StackLL();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        stack.display();
        System.out.println("\nPeek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop:");
        stack.display();
    }
}
