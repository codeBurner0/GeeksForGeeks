package Arrays.MoveZeroToEnd;

public class MoveZeroEfficient {
    public static void name(int arr[]) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    } 
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={0,99,99,99,0,100,100,0,22,170};
        name(arr);
        display(arr);
        
        
    }
}
