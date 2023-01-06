package Recursion;

public class SumOfDigit {
    public static int recursive(int n) {
        if(n==0){
            return 0;
        }
        return n%10+recursive(n/10);
    }
    public static void main(String[] args) {
        int a=23184;
        System.out.println(recursive(a));
    }
}
