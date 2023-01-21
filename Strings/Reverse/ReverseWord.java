package Strings.Reverse;

public class ReverseWord {
    public static void reverseWord(String s) {
        int start=0;int end=s.length();
        for(int i=0;i<end;i++){
            if(s.charAt(i)==' '){
                
            }
        }
    }
    public static String name(String s,int start, int end) {
        while(start<=end){
            int temp=s.charAt(start);
            char ch=s.charAt(end);
            s.charAt(start)=ch;
        }
        
    }
    public static void main(String[] args) {
        
    }
}
