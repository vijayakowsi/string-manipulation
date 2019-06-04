Given strings s1 and s2, you need to find if s2 is a rotated version of the string s1. The strings are lowercase

Example:
Input:
4
geeksforgeeks
forgeeksgeeks
mightandmagic
andmagicmigth
mushroomkingdom
itsamemario
geekofgeeks
geeksgeekof

Output:
1
0
0
1

Step 1: Create a temp string and store concatenation of str1 to str1 in temp. 
             temp = str1.str1
Step 2: If str2 is a substring of temp then str1 and str2 are 
            rotations of each other.
Example:                 
                     str1 = "ABACD"
                     str2 = "CDABA"

     temp = str1.str1 = "ABACDABACD"
     Since str2 is a substring of temp, str1 and str2 are 
     rotations of each other.
     
     
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
		   String s1=br.readLine();
		    String s2=br.readLine();
		    String s3=s1+s1;
		    if(s1.length()>s2.length())
		        System.out.println(0);
		    else if(s3.contains(s2))
		        System.out.println(1);
		    else System.out.println(0);
		    
		}
	}
}
