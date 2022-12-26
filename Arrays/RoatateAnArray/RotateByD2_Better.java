package Arrays.RoatateAnArray;

public class RotateByD2_Better {
    public static void rotateByD(int d,int[] arr) {
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[arr.length-d+i]=temp[i];
        }
        
    } 
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={50,0,99,99,99,0,100,100,0,22,170};
        rotateByD(4, arr);
        display(arr);
    }
}
