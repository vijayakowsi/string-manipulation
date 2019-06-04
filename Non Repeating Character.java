Given a string S consisting of lowercase Latin Letters. Find the first non repeating character in S.

Example:
Input : 
3
5  
hello
12
zxvczbtxyzvy
6
xxyyzz

Output :
h
c
-1


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static char nonre(String x){
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<x.length();i++){
            int count=0;
            if(hm.containsKey(x.charAt(i))){
                count=hm.get(x.charAt(i))+1;
                hm.put(x.charAt(i),count);
            }
            else{
                hm.put(x.charAt(i),1);
            }
        }
        for(int i=0;i<x.length();i++){
            if(hm.get(x.charAt(i))==1){
                return x.charAt(i);
            }
        }
        return '0';
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++){
		    String n=sc.nextLine();
		    String s=sc.nextLine();
		    if(nonre(s)=='0')
		        System.out.println("-1");
		    else
		        System.out.println(nonre(s));
		}
	}
}
