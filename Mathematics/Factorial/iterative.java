package Mathematics.Factorial;
import java.util.Scanner;
public class iterative {
    public static int factorial(int n){
        int fac=1;
        for(int i=2;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
