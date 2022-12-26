package Tree.TreeTraversal;
import java.util.LinkedList;
import java.util.Queue;
public class LevelOrder {
    public static void levelorder(Node root) {
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            Node curr=q.poll();
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            System.out.print(curr.key+" ");
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(1);
        root.left.right=new Node(2);
        levelorder(root);
        
    }
}





