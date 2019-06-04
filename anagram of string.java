Given two strings a and b consisting of lowercase characters. 
The task is to check whether two given strings are anagram of each other or not.
An anagram of a string is another string that contains same characters, only the order of characters can be different. 
For example, “act” and “tac” are anagram of each other.

Example:
Input:
2
geeksforgeeks forgeeksgeeks
allergy allergic

Output:
YES
NO


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String line=br.readLine();
		    String[] s=line.trim().split(" ");
		    char[] c1=s[0].toCharArray();
		    char[] c2=s[1].toCharArray();
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    String s1=Arrays.toString(c1);
		    String s2=Arrays.toString(c2);
		    if(s1.equals(s2))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
