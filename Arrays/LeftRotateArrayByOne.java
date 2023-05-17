import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void rotate(int[] arr) {
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        
    }
    public static void main(String[] args) {
        int[] arr={22,4,3,3,3,3,5,5,56,6,7,7,9,8};
        rotate(arr);
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
