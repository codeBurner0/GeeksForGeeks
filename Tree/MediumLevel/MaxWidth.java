package Tree.MediumLevel;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    public static int Helper(Node root) {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int count =0;
        int max=0;
        while(q.size()>0){
            Node curr=q.poll();
            if(curr!=null){
                count++;
            }
            if(curr==null){
                max=Math.max(max, count);
                count =0;
                if(q.peek()!=null){
                q.add(null);
                }
                continue;
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        // root.right.left=new Node(40);
        // root.right.right=new Node(50);
        root.left.left=new Node(5);
        root.left.right=new Node(90);
        System.out.println(Helper(root));
        
    }
}
