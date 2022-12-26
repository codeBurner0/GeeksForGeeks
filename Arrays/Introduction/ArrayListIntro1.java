package Arrays.Introduction;

import java.util.ArrayList;

public class ArrayListIntro1 {
    public static void main(String[] args) {
        ArrayList<Integer> Arr=new ArrayList<Integer>();
        // ArrayList<Integer> Arr=new ArrayList<Integer>(10); if we difine the size then it works as an array
        Arr.add(10);
        Arr.add(20);
        Arr.add(30);
        System.out.println(Arr);
    }
}
