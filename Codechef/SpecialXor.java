/*
You are given an integer C. Let d be the smallest integer such that 2d is strictly greater than C.

Consider all pairs of non-negative integers (A,B) such that A,B<2d and A⊕B=C (⊕ denotes the bitwise XOR operation). Find the maximum value of A⋅B over all these pairs.
*/

import java.util.*;
import java.lang.*;
import java.io.*;


class SpecialXor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			try{
		    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    final StringBuilder sb = new StringBuilder();
		    int testCases = Integer.parseInt(br.readLine());
		    while(testCases-->0){
		        int input = Integer.parseInt(br.readLine());
		        List<Integer> list = binary(input);
		        
		       StringBuilder a = new StringBuilder();
		       StringBuilder b = new StringBuilder();
		        
		        for(int i = 0; i<list.size(); ++i){
		            int val = list.get(i);
		            if(i == 0){
		               a.append(val);
		               if(val == 1) b.append(0);
		               else b.append(1);
		            }else{
		                if(val == 0){
		                    a.append(1);
		                    b.append(1);
		                }else{
		                    a.append(0);
		                    b.append(1);
		                }
		            }
		        }
		        
		        long aValue = Long.parseLong(a.toString(), 2);
		        long bValue = Long.parseLong(b.toString(),2);
		        
		        sb.append(aValue*bValue).append("\n");
		        }
		        
		        System.out.println(sb);
		    
		    	
		}catch(Exception e){
			return;
		}
	}
	
	private static List<Integer> binary(int input){
	    // int b_num = 0;
	    List<Integer> list = new ArrayList<Integer>();
	    while(input>0){
	        list.add(0, input%2);
	        input/=2;
	    }
	    
	    return list;
	}
}
