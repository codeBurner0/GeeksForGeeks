package Mathematics.TrailingZeroesInFactorial;

import java.util.Scanner;

public class Efficient {
    public static int NoOfTrailingZeroes(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(NoOfTrailingZeroes(n));
    }
}
