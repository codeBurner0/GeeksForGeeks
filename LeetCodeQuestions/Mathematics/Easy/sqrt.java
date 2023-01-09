public class sqrt {
    public static int mySqrt(int x) {
        long start=1,end=x,ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==x){
                ans=mid;
                break;
            }else if(mid*mid<x){
                start=mid+1;
                ans=mid;
            }else{
                end=mid-1;
            }
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
