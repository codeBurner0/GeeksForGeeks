package Strings;

public class subsequenceOrNot {
    public static boolean isSubsequence(String s1, String s2) {
        int j=0;
        int c=0;
        for(int i=0;i<s2.length();i++){
            for(;j<s1.length();j++){
                if(s2.charAt(i)==s1.charAt(j)){
                    c++;
                    break;
                }
            }
        }
        return (s2.length()-c)==0;
    }
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="fes";
        System.out.println(isSubsequence(s1, s2));
    }
}
