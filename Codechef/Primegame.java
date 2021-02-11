/*
Chef and Divyam are playing a game with the following rules:

First, an integer X! is written on a board.
Chef and Divyam alternate turns; Chef plays first.
In each move, the current player should choose a positive integer D,
which is divisible by up to Y distinct primes and does not exceed the integer currently written on the board. Note that 1 is not a prime.
D is then subtracted from the integer on the board, i.e. if the integer written on the board before this move was A, it is erased and replaced by A−D.
When one player writes 0 on the board, the game ends and this player wins
*/

import java.util.*;
import java.lang.*;
import java.io.*;
public class Primegame {
		public static void main (String[] args) throws java.lang.Exception
	{
		try{
			final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			final StringBuilder sb = new StringBuilder();
			int testCases = Integer.parseInt(br.readLine());
			while(testCases-->0){
				String input[] = br.readLine().split(" ");
				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);
				
				if(sieveOfEratosthenes(x)>y){
					sb.append("Divyam").append("\n");
				}else{
					sb.append("Chef").append("\n");
				}
			}
				
			System.out.println(sb);
		}catch(Exception e){
			return;
		}
	}
	
static int sieveOfEratosthenes(int n) 
    { 
    	int count = 0;
        // Create a boolean array "prime[0..n]" and initialize 
        // all entries it as true. A value in prime[i] will 
        // finally be false if i is Not a prime, else true. 
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<=n;i++){ 
            prime[i] = true;
        }
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= n; i += p){ 
                    prime[i] = false; 
                }
            } 
        }
         for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true){ 
                count++;
            }
        }
        return count;
	}
}
