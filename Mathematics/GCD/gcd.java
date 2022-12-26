package Mathematics.GCD;

import java.util.Scanner;

public class gcd {
    public static int  GCD(int a,int b) {
        int n=Math.min(a,b);
        int No=0;
        while(n>0){
            if(a%n==0 && b%n==0){
                 No=n;
                 break;
            }
            n--;
        }
        return No;
        
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(GCD(a, b));
    }
}
