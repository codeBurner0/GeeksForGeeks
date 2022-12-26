package Tree.Basics;

class Node{
    int key;
    Node left;
    Node right;
    Node(int key){
        this.key=key;
    }
}
public class HeightOfTree {
    public static int height(Node root) {
        if(root==null){
            return 0;
        }else{
           int d= Math.max(height(root.left),height(root.right))+1;
           return d;
        }
        
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(1);
        root.left.left.left=new Node(1);
        root.left.right=new Node(2);
        System.out.println(height(root));
    }
}



