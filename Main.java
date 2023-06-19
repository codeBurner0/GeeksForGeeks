import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        int arr[]={10,20,25};
        int res=0;
        for(int i=0;i<arr.length-1;i++){
            al1.add(i+1)=arr[i]+arr[i+1];
            al.add(arr[i+1]);
        }
        for(int i=0;i<al.size();i++){
            res+=al.get(i);
        }
        System.out.println(res);
    }
}
