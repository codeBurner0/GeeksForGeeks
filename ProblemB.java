import java.util.ArrayList;
import java.util.Scanner;

public class ProblemB {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int tCases=sc.nextInt();
        while(tCases-->0){
            int valueOfn=sc.nextInt();
            int valueOfk=sc.nextInt();
            ArrayList<Integer> MyList1=new ArrayList<>(valueOfn);
            ArrayList<Integer> MyList2=new ArrayList<>();
            for(int i=0;i<valueOfn;i++){
                MyList1.add(sc.nextInt());
            }
            int varI=0;
            for(varI=0;varI<valueOfn;varI++){
                if(MyList1.get(varI)==1){
                    MyList2.add(1);
                    break;
                }
            }
            int varJ=0;
            for(;varI<valueOfn;varI++){
                if(MyList2.get(varJ)+1==MyList1.get(varI)){
                    MyList2.add(MyList1.get(varI));
                    varJ++;
                }
            }
            int result=valueOfn-MyList2.size();
            if(result%valueOfk==0){
                System.out.println(result/valueOfk);
            }else{
                System.out.println(result/valueOfk +1);
            }
        }
}
}

    
        
    
        
        
        