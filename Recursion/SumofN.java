package Recursion;
// you can use one formula to find the sum of n natural numbers =n(n+1)/2
public class SumofN {
    public static int recursive(int n) {
        if(n==0){
            return 0;
        }
        return n+recursive(n-1);
    }
    public static void main(String[] args) {
        int a=2;
        System.out.println(recursive(a));
    }
}
