package BitManipulation.CountSetBits;
public class CountSetBits2 {
    public static int check(int n) {
        int res = 0;
        while (n > 0) {
            n=n&(n-1);
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(check(7));
    }
}
