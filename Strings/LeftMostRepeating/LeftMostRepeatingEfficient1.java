package Strings.LeftMostRepeating;

public class LeftMostRepeatingEfficient1 {
    public static void leftMostCharacter(String s) {
        int res=-1;
        boolean visited[]=new boolean[256];
        for(int i=s.length()-1;i>=0;i--){
            if(!visited[s.charAt(i)]){
                visited[s.charAt(i)]=true;
                
            }
            else if(visited[s.charAt(i)]){
                res=i;
            }
        }
        System.out.println(s.charAt(res));
    }
    public static void main(String[] args) {
        leftMostCharacter("ankitldi");
    }
}
