import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        String s="34.0";
        String bdot="";
        char c='0';
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                c=s.charAt(i+1);
                break;
            }
            bdot+=s.charAt(i);
        }
        res=Integer.parseInt(bdot);
        System.out.println(c);
        if((c-'0')<=5){
            System.out.println(res);
        }else{
            System.out.println(res+1);
        }
        
    }
}