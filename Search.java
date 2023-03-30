import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int n=0000000000000000000000000001011;
        int res=0;
        for(int i=0;i<32;i++){
            int ans=n%10;
            if(ans==1){
                res++;
            }
            n=n/10;
        }
        System.out.println(res);
        
    }
}
