import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        String s=sc.nextLine();
        String t=sc.nextLine();
        System.out.println(ProblemA(s, t));
        
    }
    public static int ProblemA(String s,String t) {
        if(s.length()!=t.length()){
            return -1;
        }
        int ch[]=new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
            ch[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ch[i]>0){
                return -1;
            }
        }
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(i)){
                res++;
            }
        }
        return s.length()-res;
    }
}
