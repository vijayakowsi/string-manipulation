Example:
Input:
2
Mr John Smith
13
Mr Benedict Cumberbatch  
25

Output:
"Mr%20John%20Smith"
"Mr%20Benedict%20Cumberbatch


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		while(t>0)
		{
		    String st=br.readLine();
		    int n=Integer.parseInt(br.readLine());
		    st=st.replaceAll(" ","%20");
		    System.out.println(st);
		    t--;
		}
	}
}
