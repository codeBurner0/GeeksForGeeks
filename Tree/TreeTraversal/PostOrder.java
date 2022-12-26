package Tree.TreeTraversal;
public class PostOrder {
    public static void postorder(Node root) {
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
        
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(1);
        root.left.right=new Node(2);
        postorder(root);
    }
}



