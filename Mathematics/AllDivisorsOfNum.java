package Mathematics;

public class AllDivisorsOfNum {
    public static void main(String[] args) {
        int n=30;
        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        for(;i>=1;i--){
            if(n%i==0){
                System.out.print(n/i+" ");
            }
        }
    }
}
