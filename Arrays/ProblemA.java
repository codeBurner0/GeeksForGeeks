package Arrays;
import java.util.Scanner;
public class ProblemA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tCases=sc.nextInt();
        while(tCases--!=0){
            int t;
            t=sc.nextInt();
            int arr[]=new int[t];
            int s=0;
            for(int i=0;i<t;i++){
                int k=sc.nextInt();
                k=arr[i];
                s=s+arr[i];
            }
            System.out.println(Math.abs(s));

        }
            
        
    }
}
