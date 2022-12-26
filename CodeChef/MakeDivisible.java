package CodeChef;


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakeDivisible
{
    public static int Divisible(int N){
        int count=0,i=1;int a=0;
        while(count!=N){
            a=(3*i);
            if((a%9)!=0 && (a%2)!=0){
                count++;
            }
            i=i+2;
        }
        return a;
    }
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int tCases=sc.nextInt();
		for(int i=0;i<tCases;i++){
		    int N=sc.nextInt();
		    System.out.println(Divisible(N));
		}
	}
}
