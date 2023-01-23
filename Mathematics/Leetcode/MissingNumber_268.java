package Mathematics.Leetcode;

public class MissingNumber_268 {
    public static int missingNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res^i^nums[i];
        }
        return res^nums.length;
    }
    public static void main(String[] args) {
        int arr[]={3,0,2};
        System.out.println(missingNumber(arr));
    }
}
