package Recursion;

public class Print1toN {
    public static void recursive(int n) {
        if(n==0){
            return ;
        }
        recursive(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int a=8;
        recursive(a);
    }
}
