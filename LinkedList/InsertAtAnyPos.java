package LinkedList;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class InsertAtAnyPos {
    static Node head;
    public static void nameinsertAtPos(int d,int p) {
        Node n=new Node(d);
        if(head==null){
        }
        Node temp=head;
        int c=0;
        while(c!=p-2){
            temp=temp.next;
            c++;
        }
        n.next=temp.next;
        temp.next=n;
        }
    public static void print(Node head){
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
        Node newNode3=new Node(40);
        head=newNode;
        newNode.next=newNode1;
        newNode1.next=newNode2;
        newNode2.next=newNode3;
        print(head);
        nameinsertAtPos(10, 2);
        System.out.println();
        print(head);
        System.out.println();
        nameinsertAtPos(70, 2);
        print(head);

    }
}
