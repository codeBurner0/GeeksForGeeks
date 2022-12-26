package Arrays;
public class sf {
    
    public static void Leader(int[] arr) {
        int res=arr[1]-arr[0];int minVal=arr[0];
        for(int i=2;i<arr.length;i++){
            res=Math.max(res, arr[i]-minVal);
            minVal=Math.min(minVal, arr[i]);
        }
    }
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={0,6,6,7,30,8,10,0,0,9,9};
        Leader(arr);
        // display(arr);
        
    }
}
