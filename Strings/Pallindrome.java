package Strings;

import java.util.Scanner;

public class Pallindrome {
    public static boolean isPallindrome(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<=high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isPallindrome(str));
    }
}
