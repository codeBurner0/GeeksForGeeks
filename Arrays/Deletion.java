import java.util.Arrays;

public class Deletion {
    public static void del(int[] arr, int pos) {
            for(int i=pos;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
        
}
    public static void main(String[] args) {
        int[] arr={1,2,0,3,8,5,6,0};
       del(arr, 2);
       del(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
