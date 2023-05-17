public class LargestElement {
    public static int lar(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
}
public static void main(String[] args) {
    int[] arr={1,2,0,3,8,5,6,0};
    System.out.println(lar(arr));
}
}
