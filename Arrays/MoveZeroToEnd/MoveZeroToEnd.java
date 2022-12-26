package Arrays.MoveZeroToEnd;

public class MoveZeroToEnd {
    public static void name(int arr[]) {
     int[] a=new int[arr.length];
     int index=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
          a[index]=arr[i];
          index++;
        }
       }
       display(a);
    } 
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={99,99,0,100,0,22,170};
        name(arr);
        
        
        
    }
}
