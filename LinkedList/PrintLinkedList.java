package LinkedList;
class Node{
    int data;
    Node next;
    Node (int x){
        data=x;
        next=null;
    }
}
public class PrintLinkedList {
    public static void display(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node newNode1=new Node(20);
        Node newNode2=new Node(30);
        head.next=newNode1;
        newNode1.next=newNode2;
        display(head);
    }
}
