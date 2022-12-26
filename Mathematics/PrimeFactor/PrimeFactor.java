package Mathematics.PrimeFactor;

import java.util.*;
public class PrimeFactor {
        public static void main(String[] args) {
                int n=12;
                while(n%2==0){
                        System.out.print(2+" ");
                        n=n/2;
                }
                while(n%3==0){
                        System.out.print(3+" ");
                        n=n/3;
                }
                for(int i=5;i*i<=n;i=i+5){
                        while(n%i==0){
                                System.out.print(i+" ");
                                n=n/i;
                        }
                        while(n%(i+2)==0){
                                System.out.print((i+2)+" ");
                                n=n/(i+2);
                        }
                }
                if(n>3){
                        System.out.println(n);
                }
                
            }
}


