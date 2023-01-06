import java.util.Arrays;
import java.util.Scanner;

public class MatheMatics {

    public static int factorial(int n){
        int fac=1;
        for(int i=2;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tCases=sc.nextInt();
        while(tCases-->0){
            int NumVal=sc.nextInt();
            for(int i=NumVal-1;i>=1;i=i-2){
                int k=(factorial(i)+factorial(i-1))%NumVal;
                if(k==0){
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
