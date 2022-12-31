package CollectionFramework.ListIterator;
import java.util.*;
public class AddMethod {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            it.add(5);
            it.next();
        }
        System.out.println(list);
    }
}
 