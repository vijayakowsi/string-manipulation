You have been given an alphanumeric string S, extract maximum numeric value from that string. Alphabets will only be in lower case.

Example:
Input:
3
100klh564abc365bg
abvhd9sdnkjdfs
abchsd0sdhs
Output:
564
9
0

Explanation:
Test Case 1: The maximum number found in the string is "564".  


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
		   
		    char[] arr=br.readLine().toCharArray();
		    int sum=0,maxsum=0;
		   for(int i=0;i<arr.length;i++)
		   {
		       if(arr[i]>='0' && arr[i]<='9')
		       {
		           int x=(int)arr[i]-'0';
		           sum=sum*10+x;
		           
		           if(sum>maxsum)
		            maxsum=sum;
		       }
		       else sum=0;
		   }
		   System.out.println(maxsum);
		}
	}
}





import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0)
		{
		   String str=sc.nextLine();
		    char[] arr=str.toCharArray();
		    int sum=0,maxsum=0;
		   for(int i=0;i<arr.length;i++)
		   {
		       if(arr[i]>='0' && arr[i]<='9')
		       {
		           int x=(int)arr[i]-'0';
		           sum=sum*10+x;
		           
		           if(sum>maxsum)
		            maxsum=sum;
		       }
		       else sum=0;
		   }
		   System.out.println(maxsum);
		}
	}
}
