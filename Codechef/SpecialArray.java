/*
Finally, progress reached the Madoka family and she decided to play with her little sister in the sensational game Space Arrays.

The rules of the game are as follows:

Initially, a sequence a1,a2,…,aN is given.
The players alternate turns.
In each turn, the current player must choose an index i and increment ai, i.e. change ai to ai+1.
Afterwards, if there is no permutation p1,p2,…,pN of the integers 1 through N such that ai≤pi holds for each valid i, the current player loses.
Otherwise, the game continues with the next turn.
Madoka is asking you to help her ― tell her if the first player (the player that plays in the first turn) or second player wins this game if both play optimally.
*/

import java.util.*;
import java.lang.*;
import java.io.*;


class SpecialArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	try{
		   final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    final StringBuilder sb = new StringBuilder();
		    int testCases = Integer.parseInt(br.readLine());
		    while(testCases-->0){
		        int len = Integer.parseInt(br.readLine());
		        String input[] = br.readLine().split(" ");
		        int arr[] = new int[len];
		        int j = 0; long val = 0;
		        for(String a: input){
		            arr[j] = Integer.parseInt(a);
		            ++j;
		        }
		        
		        Arrays.sort(arr);
		        boolean flag = false;
		        
		            for(int i = 0;i<len; ++i){
		                if(arr[i]>(i+1)){
		                	flag = true;
		                    break;
		                }
		                val= val + (i+1-arr[i]);
		            }
		            
		            if(flag) sb.append("Second").append("\n");
		            else{
		            	if(val%2==1) sb.append("First").append("\n");
		            	else sb.append("Second").append("\n");
		            }
		    }
		       
		    System.out.print(sb);
		}catch(Exception e){
		    return;
		}
	}
}
