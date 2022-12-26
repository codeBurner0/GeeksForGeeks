package Arrays.Largest;
// Add some code
import java.util.*;
public class secondLargest2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tCases=sc.nextInt();
        for(int i=0;i<tCases;i++){
            int N=sc.nextInt();
            int arr[]=new int[N];
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            int res=-1;int larg=0;
            for(int k=1;k<arr.length;k++){
                if(arr[k]>arr[larg]){
                    res=larg;
                    larg=k;
                }else if(arr[k]!=arr[larg]){
                    if(res==-1 || arr[k]>arr[res]){
                        res=k;
                    }
                }
            }
            System.out.println(arr[res]+arr[larg]);
        }
    }
}