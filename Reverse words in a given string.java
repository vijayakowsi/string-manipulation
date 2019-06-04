Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0){
		String str = scan.next();
	    String ip[] = str.split("\\.");
	    for(int i = ip.length -1 ; i>0;i--){
	        System.out.print(ip[i]+".");
	    }
	     System.out.print(ip[0]);
	    System.out.println(" ");
		}
	}
}
