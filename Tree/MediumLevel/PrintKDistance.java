package Tree.MediumLevel;

class Node{
    int key;
    Node left;
    Node right;
    Node(int key){
        this.key=key;
    }
}
public class PrintKDistance {
    public static void print(Node root,int k) {
        if(root==null) return;
        if(k==0) {
            print(root.left,k);
            System.out.println(root.key);
            print(root.right, k);
        }
        else {
            print(root.left, k-1);
            print(root.right, k-1);
        }
        
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(1);
        root.left.right=new Node(2);
        print(root,1);
    }
}




