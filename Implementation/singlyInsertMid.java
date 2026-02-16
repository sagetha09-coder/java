import java.util.Scanner;
class Node {
    int data; 
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}
class Linkedlist {
    Node head;
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void insertAtMiddle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = newNode;
        newNode.next = slow;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class singlyInsertMid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertAtEnd(sc.nextInt());
        }
        int value = sc.nextInt();
        list.insertAtMiddle(value);
        list.display();
    }
}
 