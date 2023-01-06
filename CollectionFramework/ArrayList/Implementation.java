package CollectionFramework.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
class Implementation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            al.add(sc.nextInt());
        }
        al.add(0,0);
        for(int i=0;i<N;i++){
            System.out.println(al.get(i));
        }
    }
}
