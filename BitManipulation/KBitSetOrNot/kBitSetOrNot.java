package BitManipulation.KBitSetOrNot;

public class kBitSetOrNot {
    public static boolean check(int n,int k) {
        n=n>>(k-1);
        return (n&1)==1;
    }
    public static void main(String[] args) {
        System.out.println(check(8, 2)); 
    }
}
