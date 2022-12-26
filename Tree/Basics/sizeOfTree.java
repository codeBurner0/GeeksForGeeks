package Tree.Basics;
class Node{
    int  key;
    Node left;
    Node  right;
    Node(int key){
        this.key=key;
    }
}
public class sizeOfTree {
    public static int size(Node root) {
        if(root==null){
            return 0;
        }
        int s=1+size(root.left)+size(root.right);
        return s;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        root.left.left=new Node(5);
        root.left.left.left=new Node(90);
        System.out.println(size(root));
        
    }
}