package Searching;

public class BinarySearching {
    public static int Search(int[] arr,int k) {
        int low=0,mid=0;int high=arr.length-1;
        for(int i=0;i<arr.length;i++){
            mid=low+(high-low)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
      return mid;  
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Search(arr, 3));
    }
}
