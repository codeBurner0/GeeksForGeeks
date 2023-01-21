package Strings.Anagram;

import java.util.Arrays;

public class AnagramNotEfficient {
    public static boolean isAnagram(String s1,String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        s1=new String(ch1);
        Arrays.sort(ch2);
        s2=new String(ch2);
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));
    }
}
