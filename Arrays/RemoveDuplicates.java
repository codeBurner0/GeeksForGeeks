import java.util.Arrays;

public class RemoveDuplicates {

    public static void rdup(int[] arr) {
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[count]=arr[i+1];
                count++;
            }
        }
        int j=arr.length-1;
        int start=arr.length-1-count;
        while(start>=0){
            arr[j]=0;
            j--;
            start--;
        }
        
    }
    public static void main(String[] args) {
        int[] arr={3,22,4,3,3,3,3,5,5,56,6,7,7,9,8};
        rdup(arr);
        System.out.println(Arrays.toString(arr));
    }
}
