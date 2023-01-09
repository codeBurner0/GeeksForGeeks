public class MissNo {
    public static int Number(int[] nums) {
        int n=nums.length;
        int res=0;
        while(n>0){
            res=res^n^nums[n-1];
            n--;
        }
    return res;
    }
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(Number(arr));
    }
}