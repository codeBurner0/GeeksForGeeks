import java.util.Arrays;
import java.util.Scanner;

public class SolutionProblemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TCases =sc.nextInt();
        while (TCases-- > 0) {
        int length =sc.nextInt();
        int ankit[]=new int[length];
        int neg=0;
        int sum=0;
        for(int i=0;i<ankit.length;i++){
            ankit[i]=sc.nextInt();
            sum+=Math.abs(ankit[i]);
            if(ankit[i]<0){
                neg++;
            }
        }
        Arrays.sort(ankit);
        if(neg%2==0){
            System.out.println(sum);
        }else{
            System.out.println(sum-2*ankit[0]);
        }
        
        }
    }
}

