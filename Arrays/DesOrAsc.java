public class DesOrAsc {
        public static boolean asc(int[] arr) {
            int count=0;
            boolean res=false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    count=1;
                    break;
                }
            }
            if(count==1){
                if(false || desc(arr)){
                    res=true;
                }
            }else{
                res=true;
            }
        return res;    
    }
    public static boolean desc(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
}
        public static void main(String[] args) {
            int[] arr={2,2,3,5,9,45};
            System.out.println(asc(arr));
        }
    
}
