package Arrays.Introduction;

public class DeleteItem {
    public static void name(int[] arr,int e) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==e){
                arr[i]=0;
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=0;
            }
        }
    }
    public static void display(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={34,2,3,67};
        name(arr,3 );
        display(arr);
    }
}
