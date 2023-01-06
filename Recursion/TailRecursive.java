package Recursion;
// Tail recursive solutions are faster than non tail recursive solution 
// bacause after last call execution, there is no further call but in non tail solution after last call execution
// we have to give further controll to previous calls.
public class TailRecursive {
    public static void recursive(int n,int k) {
        if(n==0){
            return ;
        }
        System.out.print(k+" ");
        recursive(n-1,k+1);
    }
    public static void main(String[] args) {
        int a=8;
        recursive(a,1);
    }
}
