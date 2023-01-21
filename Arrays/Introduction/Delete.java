package Arrays.Introduction;
public class Delete {
    public static void delete(int[] arr, int d) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                for(int j=i+1;j<arr.length;j++){
                    arr[j-1]=arr[j];
                    if(j==arr.length-1){
                        arr[j]=0;
                    }
                }
            }
        }
        display(arr);
    }
    public static void display(int[] arr) {
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,6,8,8,7};
        delete(arr, 8);
    }
}

