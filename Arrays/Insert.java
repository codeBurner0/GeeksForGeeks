import java.util.Arrays;

public class Insert {
    public static void ins(int[] arr, int pos, int data) {
            if(arr[pos]!=0){
                for(int i=arr.length-1;i>=pos;i--){
                    arr[i]=arr[i-1];
                }
                arr[pos]=data;
            }else{
                arr[pos]=data;
            }
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,3,8,5,6,0};
        ins(arr, 2, 10);
        System.out.println(Arrays.toString(arr));
    }
}
