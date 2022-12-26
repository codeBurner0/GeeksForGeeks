package Tree.TreeTraversal;

class Node{
    int key;
    Node left;
    Node right;
    Node(int key){
        this.key=key;
    }
}
public class Preorder {
    public static void preorder(Node root) {
        if(root!=null){
            
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
        
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(1);
        root.left.right=new Node(2);
        preorder(root);
    }
}



