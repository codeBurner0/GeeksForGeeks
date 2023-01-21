package Strings;

public class CharOccurrSorted {
    public static void CountCharctersSorted(String str){
        int ch[]=new int[26];
        for(int i=0;i<str.length();i++){
            ch[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ch[i]>0){
                System.out.println((char)(i+'a')+" "+ch[i]);
            }
        }
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        CountCharctersSorted(str);

    }
}
