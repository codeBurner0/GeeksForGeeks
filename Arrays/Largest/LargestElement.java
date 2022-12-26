package Arrays.Largest;

public class LargestElement {
    public static int largestElement(int []arr) {
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[idx]<arr[i]){
                idx=i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr={18,12,3,13,25,6};
        System.out.println(largestElement(arr));
  }
}
