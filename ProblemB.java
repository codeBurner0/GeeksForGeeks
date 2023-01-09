import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemB {
    public static void maxKelements(int[] arr, int k) {
        long Myresult=0;
        for(int i=0;i<k;i++){
            Arrays.sort(arr);
            Myresult+=(int)arr[arr.length-1];
            arr[arr.length-1]=(int)Math.ceil((double)arr[arr.length-1]/3);
            System.out.println(Myresult);
        }
        
    }
    
public static void main(String[] args) {
    int[] arr={1,10,3,3,3};
maxKelements(arr,3);
}
}

    
        
    
        
        
        