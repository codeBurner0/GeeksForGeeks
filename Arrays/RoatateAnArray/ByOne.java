package Arrays.RoatateAnArray;
public class ByOne {
    public static void name(int arr[]) {
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    } 
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={50,0,99,99,99,0,100,100,0,22,170};
        name(arr);
        display(arr);
    }
}
