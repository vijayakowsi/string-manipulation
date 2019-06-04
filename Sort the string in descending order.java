Example:
Input:
2
geeks
for
Output:
skgee
rof


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++){
		    String s=sc.nextLine();
		    char a[]=s.toCharArray();
		    Arrays.sort(a);
		    StringBuilder sb=new StringBuilder("");
		    sb.append(String.valueOf(a));
		    System.out.println(sb.reverse());
		}
	}
}
