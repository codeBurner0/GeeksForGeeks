package Tree.MediumLevel;

import java.util.ArrayList;
import java.util.LinkedList;

public class LeftmostView {
    public static void ll(Node root) {
        ArrayList<Node> list=new ArrayList<>();
        View(list, root, 0);
        for (Node curr:list) {
            System.out.println(curr.key+" ");
        }
    }
    public static void View(ArrayList list,Node root ,int level) {
        if(root==null){
            return;
        }
        if(list.size()==level){
            list.add(root);
        }
        View(list, root.left, level +1);
        View(list, root.right,level +1);
        
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(1);
        root.left.right=new Node(2);
        ll(root);
        
    }
}
