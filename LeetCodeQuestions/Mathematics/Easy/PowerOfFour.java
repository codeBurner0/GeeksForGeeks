public class PowerOfFour {
    public static boolean Four(int n) {
        return Math.log10(n)/Math.log10(4)%1==0;
    }
    public static void main(String[] args) {
        System.out.println(Four(64));
    }
}
