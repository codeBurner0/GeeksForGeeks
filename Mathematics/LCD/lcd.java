package Mathematics.LCD;

import java.util.Scanner;

public class lcd {
    public static int LCD(int a,int b) {
        int max=Math.max(a, b);
        int min=Math.min(a, b);
        int res=0;
        for(int i=1;i>0;i++){
            if(max*i%min==0){
                res=max*i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(LCD(a, b));
    }
}
