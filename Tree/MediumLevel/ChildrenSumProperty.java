package Tree.MediumLevel;

public class ChildrenSumProperty {
    public static boolean isCsum(Node root) {
        if(root==null){
            return true;
        }
        if(root.left==null || root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
            sum+=root.left.key;
        }
        if(root.right!=null){
            sum+=root.right.key;
        }
        return (sum==root.key && isCsum(root.left) && isCsum(root.right));
        
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(2);
        root.right=new Node(1);
        root.left.left=new Node(1);
        root.left.right=new Node(1);
        System.out.println(isCsum(root));
        
    }
}
