Given two strings S1 and S2 in lowercase, the task is to make them anagram.
The only allowed operation is to remove a character from any string.
Find minimum number of characters to be deleted to make both the strings anagram. 
If two strings contains same data set in any order then strings are called Anagrams.

Example:
Input:
2
bcadeh
hea
cddgk
gcd
Output:
3
2
 
 
 /*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String as)
        {
        //add code here.
            ArrayList<Integer> ts=new ArrayList<Integer>();
		    ArrayList<Integer> tas=new ArrayList<Integer>();
		    
		    for(int i=0;i<s.length();i++){
		    	int r=(int)s.charAt(i);
		    	ts.add(r);
		    }
		    for(int i=0;i<as.length();i++){
		    	int r=(int)as.charAt(i);
		    	tas.add(r);
		    }
		    int i=0;
		    while(i<ts.size()){
		    	int c=ts.get(i);
		    	if(tas.contains(c)){
		    	    tas.remove(tas.indexOf(c));
		    		ts.remove(ts.indexOf(c));
		    	}else{
		    		i++;
		    	}
		    }
		    return (ts.size()+tas.size());
        }
}
