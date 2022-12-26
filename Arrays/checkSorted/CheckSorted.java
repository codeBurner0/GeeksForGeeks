package Arrays.checkSorted;

public class CheckSorted {
    public static boolean isSorted(int []arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;   
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,8,6,6,7};
        System.out.println(isSorted(arr));
    }
    
}
