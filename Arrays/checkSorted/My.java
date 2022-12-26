package Arrays.checkSorted;

public class My {
    public static boolean isSorted(int []arr) {
        for(int i=1;i<arr.length;i++){
            if(i!=arr.length-1){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }else{
                if(arr[arr.length-2]>arr[arr.length-1]){
                    return false;
                }
            }
        }
        return true;   
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,6,6,6,7};
        System.out.println(isSorted(arr));
    }
    
}
