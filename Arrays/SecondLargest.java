public class SecondLargest {
    public static int lar(int[] arr) {
        int max=0;int smax=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                smax=max;
                max=i;  
            }
            else if(arr[i]!=arr[max]){
                if(smax==-1 || arr[i]>arr[smax]){
                    smax=i;
                }
            }
        }
        return arr[smax];
}
public static void main(String[] args) {
    int[] arr={8,8,8,6,10,10,10};
    System.out.println(lar(arr));
}
}
