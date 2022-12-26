package Mathematics.Prime;
import java.util.Scanner;
public class EfficientSol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPrime(n));
    }
    private static boolean isPrime(int n) {
        if(n==1)
        return false;
        else if(n==2 || n==3)
        return true;
        else if(n%2==0 || n%3==0)
        return false;
        else{
            for(int i=5;i*i<=n;i=i+6){
                if(n%i==0 || n%(i+2)==0)
                    return false;
            }
        }
        return true;
    }
}
