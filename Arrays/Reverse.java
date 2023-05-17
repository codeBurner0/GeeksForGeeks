import java.util.Arrays;

public class Reverse {
    public static void rev(int[] arr) {
        int i=0,j=arr.length-1;
        while(i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
}
