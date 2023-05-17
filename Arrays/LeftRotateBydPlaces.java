import java.util.Arrays;

public class LeftRotateBydPlaces {
    public static void drot(int arr[],int d) {
        rot(arr, 0, d-1);
        rot(arr, d, arr.length-1);
        rot(arr, 0, arr.length-1);
    }

    public static void rot(int arr[],int s, int e) {
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;

            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[] arr={22,4,3,3,3,3,5,5,56,6,7,7,9,8};
        drot(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
