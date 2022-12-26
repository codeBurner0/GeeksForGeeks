package Mathematics.TrailingZeroesInFactorial;
import java.util.Scanner;
public class iterative {
    public static long factorial(long n){
        long fac=1;
        for(long i=2;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static long NoOfTrailingZeroes(long k){
        long count=0;
        while(k>0){
            long checkZero=k%10;
            if(checkZero==0)
            count++;
            else
                return count;
            k=k/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        System.out.println("factorial of a given no is:" +factorial(n));
        long k=factorial(n);
        System.out.println("No of trailing zeroes are: " + NoOfTrailingZeroes(k));
    }
}