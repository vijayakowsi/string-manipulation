Find and print the uncommon characters of the two given strings S1 and S2.
Here uncommon character means that either the character is present in one string or it is present in other string but not in both. 
The strings contains only lowercase characters and can contain duplicates.
Example:
Input:
1
characters
alphabets
Output:
bclpr

Method 1:

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
		    char[] arr1=br.readLine().toCharArray();
		     char[] arr2=br.readLine().toCharArray();
		     
		     HashSet<Character> h1=new HashSet<Character>();
		     HashSet<Character> h2=new HashSet<Character>();
		     HashSet<Character> h3=new HashSet<Character>();
		     for(int i=0;i<arr1.length;i++)
		     {
		         h1.add(arr1[i]);
		         h3.add(arr1[i]);
		     }
		     for(int i=0;i<arr2.length;i++)
		         h2.add(arr2[i]);
		         
		     h1.removeAll(h2);
		     h2.removeAll(h3);
		     h1.addAll(h2);
		        
		    ArrayList <Character> list=new ArrayList<Character>();
		    for(char c: h1)
		        list.add(c); 
		        
		        Collections.sort(list);
		        
		        for(char c: list)
		            System.out.print(c);
		            System.out.println();
		        
		     
		}
	}
}

Method 2:

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-- > 0){
		    String s1 = scan.nextLine();
		    String s2 = scan.nextLine();
		    int arr[] = new int[26];
		    for(int i=0;i<s1.length();i++)
		    {
		        int ch = s1.charAt(i);
		            arr[ch-97] = 1;
		    }
		    for(int i=0;i<s2.length();i++)
		    {
		        int ch = s2.charAt(i);
		        if(arr[ch-97] == 1 || arr[ch-97] == -1 )
		        {
		            arr[ch-97] = -1;
		        }
		        else
		        {
		            arr[ch-97] = 2;
		        }
		    }
		    for(int i=0;i<26;i++){
		        if(arr[i] == 1 || arr[i] == 2){
		            System.out.print((char)(i+97));
		        }
		    }
		    System.out.println();
		}
	}
}
