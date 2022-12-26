package Arrays.ReverseArray;

public class Reverese {
    public static void Reverse(int []arr) {
        int low=0,high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        display(arr);
        }
        public static void display(int[] arr) {
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
        }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,6,8,6,7};
        Reverse(arr);
    }
}
