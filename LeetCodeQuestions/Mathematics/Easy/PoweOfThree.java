public class PoweOfThree {
    public static boolean Three(int n) {
        return Math.log10(n)/Math.log10(3)%1==0;
    }
    public static void main(String[] args) {
        System.out.println(Three(273));
    }
}
