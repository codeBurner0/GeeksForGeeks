package LinkedList;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class SearchNodeRecursive {
    static Node head;
    static int c=0;
    public static void  SearchRecursive(Node head,int d) {
    
        if(head==null){
            return;
        }
        else{
            if(head.data!=d){
                c++;
                SearchRecursive(head.next, d);
            }
            else{
             System.out.print(c);;
            }
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
         SearchRecursive(head,30);
         System.out.println();
        print(head);
        
    }
}

