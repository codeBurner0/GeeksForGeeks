package Strings.LeftMostRepeating;

public class LestMostRepeatEfficient0 {
    public static char leftMostCharacter(String s) {
        int ch[]=new int[256];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)]++;        
        }
        int j=0;
        for(;j<s.length();j++){
            if(ch[s.charAt(j)]>1){
                return s.charAt(j);
            }        
        }
        return 'N';
    }
    public static void main(String[] args) {
        System.out.println(leftMostCharacter("ankitAnand"));
    }
}
