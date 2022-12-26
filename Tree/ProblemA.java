package Tree;

import java.util.Scanner;

import java.util.*;
import java.lang.*;
import java.io.*;
class ProblemA{
/* Name of the class has to be "Main" only if the class is public. */

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int tCases=sc.nextInt();
		while(tCases-->0){
		    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            String str=sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer val = map.get(c);
                if (val != null) {
                    map.put(c, new Integer(val + 1));
                }
                else {
                    map.put(c, 1);
                }
            }
		}
	}

}

// This code is contributed by 29AjayKumar
