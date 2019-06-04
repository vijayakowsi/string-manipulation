Given two strings S1 and S2 as input, the task is to merge them alternatively
i.e. the first character of S1 then the first character of S2 and so on till the strings end.
Example:
Input:
2
Hello Bye
abc def

Output:
HBeylelo
adbecf
Method 1:
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    String s1=sc.next();
		    String s2=sc.next();
		    StringBuilder merge=new StringBuilder();
		    int l1=s1.length();
		    int l2=s2.length();
		    int i=0,j=0;
		    while(i<l1 && j<l2){
		        merge.append(s1.charAt(i));
		        merge.append(s2.charAt(j));
		        i++;j++;
		    }
		    while(i<l1)
		        merge.append(s1.charAt(i++));
		    while(j<l2)
		        merge.append(s2.charAt(j++));
		    System.out.println(merge.toString());
		}
	}
}

method 2:

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    String first=sc.next();
		    String second=sc.next();
		    int i;
		    for(i=0;i< first.length()&&i<second.length();i++)
		    {
		        System.out.print(first.charAt(i));
		        System.out.print(second.charAt(i));
		    }
		    if(i<first.length())
		    {
		        while(i<first.length())
		           {
		               System.out.print(first.charAt(i));
		               i++;
		           }
		    }
		    else  if(i<second.length())
		    {
		        while(i<second.length())
		           {
		               System.out.print(second.charAt(i));
		               i++;
		           }
		    }
		    System.out.println();
		}
	}
}
