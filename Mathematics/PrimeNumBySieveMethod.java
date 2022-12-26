package Mathematics;

import java.util.Arrays;

public class PrimeNumBySieveMethod {
    public static void main(String[] args) {
        int n=30;
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i<=n;i++){
            if(arr[i]){
                System.out.print(i+" ");
                for(int j=i*i;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }
    }
}
