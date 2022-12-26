package Mathematics;
import java.util.*;;
public class countDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        while(N>0){
            count ++;
            N=N/10;
        }
        System.out.println(count);
    }
}
