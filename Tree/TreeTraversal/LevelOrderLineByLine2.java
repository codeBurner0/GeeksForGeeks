package Tree.TreeTraversal;

import java.util.LinkedList;
import java.util.Queue;
public class LevelOrderLineByLine2 {
    public static void level(Node root) {
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            if(q.peek()==null){
                System.out.println();
                q.poll();
                q.add(null);
            }
            Node curr =q.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(0);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(80);
        root.left.right=new Node(50);
        // System.out.println(height(root));
        level(root);
    }
}
