import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void move(int arr[]) {
        int zero=0;
        int nzero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[nzero]!=0){
                int temp=arr[zero];
                arr[zero]=arr[nzero];
                arr[nzero]=temp;
                zero++;
                nzero++;  
            }else{
                nzero++;
            }
            
        }
        
    }
    public static void main(String[] args) {
        int arr[]={0,2,0,3,4,0,5,0,6};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
}
