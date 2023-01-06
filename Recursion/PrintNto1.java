package Recursion;

public class PrintNto1 {
    public static void recursive(int n) {
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        recursive(n-1);
    }
    public static void main(String[] args) {
        int a=8;
        recursive(a);
    }
}
