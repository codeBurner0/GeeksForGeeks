import java.util.*;
public class list {
    public static void main(String[] args) {
        LinkedList<Integer> al=new LinkedList<>();
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(8);
        al.add(89);
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+10+" ");
        }
    }
}
