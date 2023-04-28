package DynamicProgramming.LongestCommonSubsequence;

public class lcs {
    public static int Lcs(String a,String b, int m,int n) {
        if(m==0 || n==0){
            return 0;
        }
        if(a.charAt(m-1)==b.charAt(n-1)){
            return 1+Lcs(a, b, m-1, n-1);
        }
        else{
            return Math.max(Lcs(a, b, m-1, n),Lcs(a, b, m, n-1));
        }
    }
    public static void main(String[] args) {
        String a="aeiou";
        String b="aiu";
        System.out.println(Lcs(a, b, a.length(), b.length()));
    }
}
