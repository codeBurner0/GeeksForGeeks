package BitManipulation.PowerOfTwo;

public class PowerOfTwo1 {
    public static boolean Power(int n) {
        if(((n&(n-1))==0) && (n&1)==0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(Power(512));
    }
}
