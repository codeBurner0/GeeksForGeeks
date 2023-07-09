package MostImportant.HashSet;
import java.util.*;
public class Introduction {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(44);
        set.add(3);
        set.add(9);
        set.add(5);
        set.add(6);
        set.add(6);
        System.out.println(set);
        // size of the set
        System.out.println(set.size());
        // searching in hashset
        System.out.println(set.contains(44));
        System.out.println(set.contains(45));
        System.out.println(set.isEmpty());

        //delete an element
        set.remove(44);
        
        //iterate in set
        for(Integer i:set){
            System.out.println(i);
        }

        //clear the set
        set.clear();
        System.out.println(set);


    }
}
