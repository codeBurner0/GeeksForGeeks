public class PracticeTime {
    public static boolean makeStringsEqual(String s, String target) {
        int one=0;
        int zero=0;
        int sone=0;
        int szero=0;
        if(s.length()!=target.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }
            if(s.charAt(i)=='0'){
                zero++;
            }
            if(target.charAt(i)=='1'){
                sone++;
            }
            if(target.charAt(i)=='0'){
                szero++;
            }
        }
        if((one==sone && zero==szero)){
            return true;}
        else if(sone==target.length() && one<0){
            return false;
        } else if(one==s.length() && sone<0){
            return false;
        }else if(zero==s.length() && sone>0){
            return false;
        }else if(szero==target.length() && one>0){
            return false;
        }
        
        
       return true;
    }

    

    public static void main(String[] args) {

        System.out.println(makeStringsEqual("101110100","110011000"));
    }
}