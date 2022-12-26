package Tree.Basics;

public class MaximumValue {
    public static int Max(Node root) {
        if(root==null){
            return 0;
        }
        int mx=Math.max(root.key,Math.max(Max(root.left),Max(root.right)));
        return mx;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        root.left.left=new Node(5);
        root.left.left.left=new Node(90);
        System.out.println(Max(root));
        
    }
}
