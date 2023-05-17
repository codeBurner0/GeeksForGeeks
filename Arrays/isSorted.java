public class isSorted {
    public static boolean sorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
}
    public static void main(String[] args) {
        int[] arr={3,3,3,5,6,7};
        System.out.println(sorted(arr));
    }
}
