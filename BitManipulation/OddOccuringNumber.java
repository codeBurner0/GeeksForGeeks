package BitManipulation;

public class OddOccuringNumber {
    public static int Number(int arr[]) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            res^=arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={8,7,7,8,8};
        System.out.println(Number(arr));
    }
}
