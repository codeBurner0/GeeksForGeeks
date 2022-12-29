package BitManipulation.KBitSetOrNot;

public class kBitSetOrNot2 {
    public static boolean check(int n,int k) {
            return ((n&(1<<(k-1)))!=0);
        
    }
    public static void main(String[] args) {
        System.out.println(check(5, 3)); 
    }
}
