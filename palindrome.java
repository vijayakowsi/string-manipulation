Example:
Input:
1
4
abba
Output:
Yes


/*package whatever //do not write package name here */

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
             int n=sc.nextInt();
             String s=sc.next();
             StringBuilder s1=new StringBuilder(s);
             s1.reverse();
             String s2=s1.toString();
             if(s.equals(s2))
             {
                 System.out.println("Yes");
             }
             else
             {
                 System.out.println("No");
             }
         }
	}
}
