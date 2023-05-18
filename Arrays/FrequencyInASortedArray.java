public class FrequencyInASortedArray {
    public static void freq(int arr[]) {
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                count++;
            }else{
                System.out.println(arr[i-1]+" "+count);
                count=1;
            }
        }
        System.out.println(arr[arr.length-1]+" "+count);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30};
        freq(arr);
    }
}
