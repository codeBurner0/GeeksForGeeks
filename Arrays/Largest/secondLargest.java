package Arrays.Largest;

public class secondLargest {
    public static int name(int[] arr) {
        int idx=0;
        for(int i=1;i<arr.length;i++){
            if(arr[idx]<arr[i]){
                idx=i;
            }
        }
        return idx;
    }
    public static int second(int[] arr) {
        int larg=name(arr);
        int res=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[larg]){
                if(res==-1){
                    res=i;
                }
                else if(arr[res]<arr[i]){
                    res =i;
                }
            }
        }
        return res;   
    }
    public static void main(String[] args) {
        int[] arr={8,8,8,8};
        System.out.println(name(arr));
        System.out.println(second(arr));

    }
    
}
