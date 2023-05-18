public class LeaderInArray {
    public static void leader(int arr[]) {
        int max=arr[arr.length-1];
        System.out.print(max+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }
        
    }
    public static void main(String[] args) {
        int[] arr={7,10,4,3,6,5,2};
        leader(arr);
    }
}
