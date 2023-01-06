package CollectionFramework.ArrayList;

import java.util.*;

public class Methods2 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(20);
        al.add(30);
        al.add(20);
        al.add(30);
        int res=al.get(0);
        if(res==20){
            al.set(0,10);
        }
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.print(al.indexOf(30)+" ");
        System.out.print(al.lastIndexOf(30));
    }
}
