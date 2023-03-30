import java.util.Scanner;
public class ProblemA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int TCases=sc.nextInt();
        while(TCases-->0){
         int len=sc.nextInt();
         int mera[]=new int[len];
         for(int i=0;i<mera.length;i++){
            mera[i]=sc.nextInt();
            if(mera[i]==1){
                mera[i]++;
            }
         }
         for(int i=0;i<mera.length-1;i++){
            if(mera[i+1]%mera[i]==0){
                mera[i+1]++;
            }
         }
         for(int i=0;i<mera.length;i++){
            System.out.print(mera[i]+" ");
         }
    }
}
}


