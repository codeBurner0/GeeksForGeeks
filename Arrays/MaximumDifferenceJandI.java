public class MaximumDifferenceJandI {
    public static int diff(int arr[]) {
        int min=arr[0];int res=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            res=Math.max(res, arr[i]-min);
            if(arr[i]<min){
                min=arr[i];
            }
        }
       return res; 
    }
    public static void main(String[] args) {
        int[] arr={2,3,10,6,4,8,1};
        System.out.println(diff(arr));
    }
}
// Note finf max arr[j]-arr[i]   j>i