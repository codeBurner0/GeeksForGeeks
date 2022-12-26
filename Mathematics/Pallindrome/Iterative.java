package Mathematics.Pallindrome;

import java.util.Scanner;
public class Iterative {
public static boolean Pallindrome1(int n){
    int rev=0;
    int temp=n;
    while(temp>0){
        int ld=temp%10;
        temp=temp/10;
        rev=rev*10+ld;
    }
    if(rev==n) return true;
    else return false;
}
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        System.out.println(Pallindrome1(n));
    }
}
