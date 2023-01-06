package Recursion;

public class RopeCuttingProblem {
    public static int recursive(int n,int a,int b,int c,int d) {
        if(a==0 && b==0 && c==0){
            return d;
        }
        d++;
        recursive(n,n-a,n-b,n-c,d);
        return d;
    }
    public static void main(String[] args) {
        int n=5,a=2,b=5,c=1,d=0;
        System.out.println(recursive(n,a,b,c,d));
    }
}
