package LinkedList;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class SearchNode {
    static Node head;
    public static int  Search(int d) {
        Node temp=head;
        int c=0;
        while(temp.data!=d){
            temp=temp.next;
            c++;
        }
        return c;
    }
    public static void print(Node head) {
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
        
    }
    
    public static void main(String[] args) {
        Node newNode= new Node(10);
        Node newNode1= new Node(20);
        Node newNode2= new Node(30);
        Node newNode3= new Node(40);
        Node newNode4= new Node(50);
        head=newNode;
        newNode.next=newNode1;
        newNode1.next=newNode2;
        newNode2.next=newNode3;
        newNode3.next=newNode4;
        System.out.println( Search(30));
        print(head);
        
    }
}
