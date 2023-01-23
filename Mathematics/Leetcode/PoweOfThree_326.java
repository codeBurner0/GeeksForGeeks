package Mathematics.Leetcode;

public class PoweOfThree_326 {
    public static boolean isPowerOfThree(int n) {
        return Math.log10(n)/Math.log10(3)%1==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
