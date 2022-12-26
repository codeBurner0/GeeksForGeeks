package Tree.MediumLevel;

public class IsBinaryTree {
    public static boolean IsBinary(Node root) {
        int l=isBT(root.left);
        int r=isBT(root.right);
        int res=Math.abs(r-l);
        return res==0 || res==1;
        
    }
    public static int isBT(Node root) {
        if(root==null){
            return 0;
        }
        int l=isBT(root.left)+1;
        int r=isBT(root.right)+1;
        int res=Math.max(r,l);
        return res;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.right=new Node(50);
        System.out.println(IsBinary(root));
    }
}
