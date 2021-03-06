/*
Codechef February Challenge
There are N frogs (numbered 1 through N) in a line. For each valid i, the i-th frog is initially at the position i, 
it has weight Wi, and whenever you hit its back, it jumps a distance Li to the right, i.e. its position increases by Li.
The weights of the frogs are pairwise distinct.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Frogsort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-->0){
			int n = Integer.parseInt(br.readLine());
			String weights[] = br.readLine().split(" ");
			String lengths[] = br.readLine().split(" ");
			final ArrayList<String> list = new ArrayList<String>(Arrays.asList(weights));
			final ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(lengths));
			final String lst[] = new String[20];
			final ArrayList<String> list3 = new ArrayList<String>(Arrays.asList(lst));
			
			int i = 2, count = 0;
			while(i<=n){
				String val = Integer.toString(i);
				if(list.contains(val)){
					int index = list.indexOf(val);
					int prevValIndex = -1;
					if(i-1 == 1){
						prevValIndex = list.indexOf(Integer.toString(i-1));
					}else{
						prevValIndex = list3.indexOf(Integer.toString(i-1));
					}
					int length = Integer.parseInt(list2.get(index));
					while(index<=prevValIndex){
						count++;
						index+=length;
					}
					list3.set(index, val);
					++i;
				}
			}
			System.out.println(count);
			
		}
	}catch(Exception e){
		return;
	}
	
	}
}
