package Arrays.Introduction;

public class OperationsOnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int e=6;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==e){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
