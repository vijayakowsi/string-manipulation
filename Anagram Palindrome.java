Given a string S, Check if characters of the given string can be rearranged to form a palindrome. 
For example characters of “geeksogeeks” can be rearranged to form a palindrome “geeksoskeeg”, 
but characters of “geeksforgeeks” cannot be rearranged to form a palindrome.
Example:
Input:
2
geeksogeeks
geeksforgeeks
Output:
Yes
No

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t-- > 0) {
		    String a = s.next();
		    
		    HashSet<Character> pat = new HashSet<Character>();
		    
		    for (int i=0; i<a.length(); i++) {
		        if (pat.contains(a.charAt(i))) {
		            pat.remove(a.charAt(i));
		        } else {
		            pat.add(a.charAt(i));
		        }
		    }
		    
		    int ans = pat.size();
		    
		    System.out.println(ans == 0 || ans == 1 ? "Yes" : "No");
		}
	}
}
