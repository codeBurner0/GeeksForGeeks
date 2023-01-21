import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemB {
    public static int RangePrime(String s1,String s2) {
        int num=0;
        int j=0;
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            for(;j<s1.length();j++){
                if(s1.charAt(j)==c){
                    num++;
                    break;
                }
            }
        }
        int res=s2.length()-num;
        return res;
    }
    
public static void main(String[] args) {
    System.out.println(RangePrime("abcz","azdb"));
}
}

    
        
    
        
        
        