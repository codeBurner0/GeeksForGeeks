import java.util.Scanner;;
public class ProblemA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tCases=sc.nextInt();
        while(tCases-->0){
            long mul=1;
            int n=sc.nextInt();
            int val[]=new int[n];
            for(int i=0;i<n;i++){
                val[i]=sc.nextInt();
                mul*=val[i];
            }
            System.out.println((mul+(n-1))*2022);
        }
    }
}
