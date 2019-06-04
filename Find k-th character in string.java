Given a decimal number m. Convert it in binary string and apply n iterations, in each iteration 0 becomes 01 and 1 becomes 10.
Find kth character in the string after nth iteration.

Example:
Input:
2
5 5 3
11 6 4

Output:
1
1


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int T = sc.nextInt();
		while(T-- > 0)
		{
		    StringBuilder sb = new StringBuilder();
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    int n = sc.nextInt();
		    String str = Integer.toBinaryString(m);
		   char[] digits = str.toCharArray();
		    int a = 0;
		    while(a < n){
		        String newBinary = "";
		        for(int j = 0; j < digits.length; j++){
		            if(digits[j] == '0'){
		                newBinary += "01";
		            } else {
		                newBinary += "10";
		            }
		        }
		        digits = newBinary.toCharArray();
		        a++;
		    }
		    System.out.println(digits[k]);
		}
	}
}
