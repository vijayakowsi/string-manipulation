Example:
Input:
2
AXY YADXCP
gksrek geeksforgeeks

Output:
0
1

Explanation:
Testcase1: 
Input: A = "axy", B = "yadxcp"
Output: 0 (A is not a subsequence of B)
Testcase2:
Input: A = "gksrek", B = "geeksforgeeks"
Output: 1 (str1 is a subsequence of str2)

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0){
		    int i;
		int index=0;
		    String s=sc.nextLine();
		    String str[]=s.split(" ");
		    char a[]=str[0].toCharArray();
		    char b[]=str[1].toCharArray();
		    for( i=0;index<a.length && i<b.length;i++)
		    {
		        if(a[index]==b[i])
		        {
		            index++;
		        }
		    }
		    if(index==a.length)
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
