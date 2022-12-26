package Mathematics.Prime;
import java.util.Scanner;
public class CheckPrime {
    public static boolean isPrime(int n) {
        boolean p=true;
        if(n==2 || n==3){
             p=true;
        }
        else if(n%2==0 || n%3==0){
            p=false;
        }
        else{
        for(int i=5;i*i<=n;i++){
            if(n%i==0){
                p=false;
                break;
            }
            i++;
        }
    }
    return p; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPrime(n));
    }
}
