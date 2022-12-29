package BitManipulation;

public class MissingNumber {
    public static int Number(int arr[]) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i]^(i+1);
        }
        return res^(arr.length+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,8,6,7,4};
        System.out.println(Number(arr));
    }
}
