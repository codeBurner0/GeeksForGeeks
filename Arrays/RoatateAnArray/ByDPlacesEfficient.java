package Arrays.RoatateAnArray;

public class ByDPlacesEfficient {
    public static void name(int arr[],int d) {
        reverse(arr, 0,d-1);
        reverse(arr,d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    } 
    public static void reverse(int[] arr,int l,int h) {
        int low=l,high=h;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={50,0,99,99,99,0,100,100,0,22,170};
        name(arr,3);
        display(arr);
    }
}
