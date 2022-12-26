import java.util.Arrays;

public class MatheMatics {

    public static void prime(int a) {
        if(a<=1) return;
        if(a%2==0){
            while(a%2==0){
                System.out.print("2"+ " ");
                a=a/2;
            }
        }
        if(a%3==0){
            while(a%3==0){
                System.out.print("3"+ " ");
                a=a/3;
            }
        }
        for(int i=5;i*i<=a;i=i+6){
            if(a%i==0){
                while(a%i==0){
                    System.out.print(i+ " ");
                    a=a/i;
                }
            }
            if(a%(i+2)==0){
                while(a%(i+2)==0){
                    System.out.print((i+2)+ " ");
                    a=a/(i+2);
                }
            }
        }
        if(a>3){
            System.out.print(a);
        }
    }
    

    public static void main(String[] args) {
        int a = 42;
        prime(a);
        // System.out.println(prime(a));
    }
}
