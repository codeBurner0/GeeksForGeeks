package Strings.Reverse;

public class reverseString {
    public static void ReverseWord(String s) {
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        ReverseWord("Ankit Anand");
    }
}
