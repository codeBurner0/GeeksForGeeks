package Recursion;
public class Pallindrome {
    public static boolean recursive(String s,int start,int end) {
        if(start>=end){
            return true;
        }
       return s.charAt(start)==s.charAt(end) && recursive(s, start+1, end-1);
    }
    public static void main(String[] args) {
        String str="apwypa";
        System.out.println(recursive(str,0,str.length()-1));
    }
}
