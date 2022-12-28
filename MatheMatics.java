import java.util.Arrays;

public class MatheMatics {

    public static int pow(int n,int p) {
        int power=1;
        for(int i=0;i<p;i++){
            power=power*n;
        }
        return power;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,20));
    }
}
