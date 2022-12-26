package Arrays.DuplicateElements;

public class My {
    public static void name(int[] arr) {
        
        for(int k=0;k<arr.length;k++){
        for(int i=k;i<arr.length;i++){
            if(arr[k]==arr[i]){
                for(int j=i+1;j<arr.length;j++){
                    arr[j-1]=arr[j];
                    if(j==arr.length-1){
                        arr[j]=0;
                    }
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
        int[] arr={1,2,2,4,3,4,3,6,8,8,8,7,9,9,9};
        name(arr);
    }
    
}
