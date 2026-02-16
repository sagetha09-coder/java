import java.util.Scanner;
class Node {
    int data; 
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}
class Linkedlist {
    Node head;
    void insert(int data) {  
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    } 
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class doublebeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }
        list.display();
    }
}

        