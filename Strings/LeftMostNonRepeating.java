package Strings;

public class LeftMostNonRepeating {
    public static int leftMostNonReaptedCharacter(String s) {
        int visited[]=new int[256];
        for(int i=s.length()-1;i>=0;i--){
                visited[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
                if(visited[s.charAt(i)]==1){
                    return i;
                }
        }
    return -1;   
    }
    public static void main(String[] args) {
        System.out.println(leftMostNonReaptedCharacter("apple"));
    }
}
