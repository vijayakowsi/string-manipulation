

Add Binary Strings
Given two binary strings s1 and s2. Print the resultant string after adding given two binary strings.
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
		    int i,j;
		    String s1 = in.next();
		    String s2 = in.next();
		    String s3 = "";
		    while(s1.length()>s2.length())
		    s2 = "0" + s2;
		    while(s2.length()>s1.length())
		    s1 = "0" + s1;
		    
		    char car='0';
		    i = s1.length()-1;
		    j = s2.length()-1;
		    while(i>=0 && j>=0){
		        if(s1.charAt(i)=='0' && s2.charAt(j)=='0' && car=='0'){
		            car = '0';
		            s3 =  "0" + s3;
		        }
		         else if(s1.charAt(i)=='0' && s2.charAt(j)=='0' && car=='1'){
		            car = '0';
		            s3 =  "1" + s3 ;
		        }
		         else if(s1.charAt(i)=='0' && s2.charAt(j)=='1' && car=='0'){
		            car = '0';
		            s3 = "1" + s3 ;
		        }
		        else  if(s1.charAt(i)=='0' && s2.charAt(j)=='1' && car=='1'){
		            car = '1';
		            s3 =  "0" + s3 ;
		        }
		        else  if(s1.charAt(i)=='1' && s2.charAt(j)=='0' && car=='0'){
		            car = '0';
		            s3 =  "1" + s3;
		        }
		       else  if(s1.charAt(i)=='1' && s2.charAt(j)=='0' && car=='1'){
		            car = '1';
		            s3 = "0" + s3 ;
		        }
		        else if(s1.charAt(i)=='1' && s2.charAt(j)=='1' && car=='0'){
		            car = '1';
		            s3 =  "0" + s3;
		        }
		        else if(s1.charAt(i)=='1' && s2.charAt(j)=='1' && car=='1'){
		            car = '1';
		            s3 = "1" +s3 ;
		        }
		        i--;
		        j--;
		    }
		    if(car=='1')
		    s3 = "1" + s3;
		    System.out.println(s3);
		    t--;
		}
	}
}
