package LinkedList;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class InsertAtBegin {
    static Node head;
    public static void insertBegining(int d) {
        Node n=new Node(d);
        if(head==null){
            head=n;
        }
        n.next=head;
        head=n;
        
    }
    public static void print(Node head) {
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
    public static void main(String[] args) {
        Node newNode=new Node(10);
        Node newNode1=new Node(20);
        Node newNode2=new Node(30);
        head=newNode;
        newNode.next=newNode1;
        newNode1.next=newNode2;
        print(head);
        insertBegining(40);
        System.out.println();
        print(head);
    }
    
}
