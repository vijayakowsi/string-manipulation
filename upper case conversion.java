Example:
Input:
1
I love programming
Output:
I Love Programming


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
		    String[] sp=s.split(" ");
		    for(int k=0;k<sp.length;k++){
		        if(sp[k].length()==0){
		            System.out.print(" ");
		        }
		        else{
    		        System.out.print(String.valueOf(sp[k].charAt(0)).toUpperCase()+sp[k].substring(1)+" ");
		        }
		    }
		    System.out.println();
		}
	}
}
