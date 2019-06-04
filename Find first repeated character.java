Given a string S.
The task is to find the first repeated character in it.
We need to find the character that occurs more than once and whose index of first occurrence is smallest. 
S contains only lowercase letters.

Example:
Input:
2
geeksforgeeks
hellogeeks

Output:
e
l

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static char repeated(String str)
    {
         HashSet<Character> sh=new HashSet<Character>();
		    for(int i=0;i<str.length();i++)
		    {
		        if(sh.contains(str.charAt(i)))
		        {
		           return str.charAt(i);
		        }
		        else
		        {
		            sh.add(str.charAt(i));
		        }
		    }
		    return '0';
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String str=sc.nextLine();
		   if( repeated(str)=='0')
		   {
		       System.out.println("-1");
		   }
		   else
		   {
		       System.out.println(repeated(str));
		   }
		 
		}
		}
}
