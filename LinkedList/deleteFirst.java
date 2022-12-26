package LinkedList;
class Node1{
    int data;
    Node next;
    Node1(int x){
        data=x;
        next=null;
    }
}
public class deleteFirst {
    static Node head;
    public static void deletefirst() {
        if(head==null){
            System.out.println("null");
        }else{
        head=head.next;   
        }
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
        head=null;
        print(head);
        deletefirst();
        System.out.println();
        print(head);
    }
    
}
