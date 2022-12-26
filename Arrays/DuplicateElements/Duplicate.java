
import java.util.Scanner;

public class Duplicate {
    public static void name(int arr[]) {
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[res]=arr[i];
                res++;
            }
        }
    } 
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int tCase=sc.nextInt();
       for(int i=0;i<tCase;i++){
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int j=0;j<arr.length;j++){
            arr[j]=sc.nextInt();
        }
        if(arr[0]==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
}
