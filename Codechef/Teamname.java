/*
Сhef has assembled a football team! Now he needs to choose a name for his team. 
There are N words in English that Chef considers funny. These words are s1,s2,…,sN.
Chef thinks that a good team name should consist of two words such that they are not funny, 
but if we swap the first letters in them, the resulting words are funny. 
Note that under the given constraints, this means that a word is a non-empty string containing only lowercase English letters.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Teamname
{
	public static void main (String[] args) throws java.lang.Exception
	{
			try{
			final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			final StringBuilder sb = new StringBuilder();
			int testCases = Integer.parseInt(br.readLine());
			while(testCases-->0){
			    int length = Integer.parseInt(br.readLine());
			    final String input[] = br.readLine().split(" ");
			    final HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
			    
			    for(int i = 0; i<length; ++i){
			    	String val = input[i].substring(0,1);
			    	String val2 = input[i].substring(1);
			    	if(map.get(val2) == null){
			    		map.put(val2, new ArrayList<String>());
			    	}
			    		map.get(val2).add(val);
			    	}			    	
			    	
			    final ArrayList<String> list = new ArrayList<String>();
			    	for(String key: map.keySet()){
			    		list.add(key);
			    	}
			    	int total = 0;
			    	for(int i = 0; i<list.size(); ++i){
			    		for(int j = i+1; j<list.size(); ++j){
			    			
			    			int val = intersectionOfList(map.get(list.get(i)), map.get(list.get(j)));
			    			total+= (val-map.get(list.get(i)).size())*(val-map.get(list.get(j)).size());
			    		}
			    	}
			    	sb.append(total*2).append("\n");
			    }
			    System.out.println(sb);
			}catch(Exception e){
				return;
			}
	}
	
	private static int intersectionOfList(ArrayList list1, ArrayList list2){
		HashSet set = new HashSet<ArrayList<String>>(list1);
		set.addAll(list2);
		return set.size();
	}
}
