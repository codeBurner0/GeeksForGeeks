package Mathematics.Reverse;
import java.util.Scanner;
class Reverse{
    public static int reverse(int x) {
        long rev=0;
        while(x!=0){
            int lastDigit=x%10;
            x=x/10;
            rev=rev*10+lastDigit;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
    public static void main(String[] args) {
        // int rev=0;
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // while(n!=0){
        //     int r=n%10;
        //     n=n/10;
        //     rev=rev*10+r;
        // }
        // System.out.println(rev);
        System.out.println( reverse(-123));
       
}
}
