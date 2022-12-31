package BitManipulation;
import java.util.Arrays;
public class MissingNumber {
    public static int Number(int arr[]) {
        Arrays.sort(arr);
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i]^(i+1);
            if(i%2==0){
            }
        }
        return res^(arr.length+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,2,1,1,1};
        System.out.println(Number(arr));
    }
}
