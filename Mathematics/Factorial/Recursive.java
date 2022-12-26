package Mathematics.Factorial;

import java.util.Scanner;

public class Recursive {
    public static int factorialRecursive(int n){
        if(n==0){
            return 1;
        }
        return factorialRecursive(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorialRecursive(n));
    }
}

