package Strings.LeftMostRepeating;

public class LeftMostRepeating {
    public static char leftMostCharacter(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return s.charAt(i);
                }
            }
        }
        return 'N';
    }
    public static void main(String[] args) {
        System.out.println(leftMostCharacter("ankitAnand"));
    }
}
