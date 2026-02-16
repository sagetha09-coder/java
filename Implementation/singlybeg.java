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
    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void display(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class singlybeg{
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
