import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tCases=sc.nextInt();
        while(tCases-->0){
            int myValue=sc.nextInt();
            long res=myValue*(myValue-1);
            long resMod=1000000007;
            for(int i=1;i<=myValue;i++){
                res=((res)*i)%resMod;
            }
            System.out.println(res);
        }
    }
}


    
        
    
        
        
        