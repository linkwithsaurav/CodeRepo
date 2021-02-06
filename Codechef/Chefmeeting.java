/*
Codechef february Challenge.
Chef has scheduled a meeting with his friends at a time P. He has N friends (numbered 1 through N); 
for each valid i, the i-th friend is available from a time Li to a time Ri (both inclusive). 
For each friend, can you help Chef find out if this friend will be able to attend the meeting? More formally, check if Li≤P≤Ri for each valid i.
*/


import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

/* Name of the class has to be "Main" only if the class is public. */
class Chefmeeting
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int testCases = Integer.parseInt(br.readLine());
		    while(testCases-->0){
		    final StringBuilder sb = new StringBuilder();
		        String meetTime = br.readLine();
		        int length = Integer.parseInt(br.readLine());
		        for(int i = 0; i<length; ++i){
		        	String input = br.readLine();
		        	sb.append(checkTime(input.substring(0,8), input.substring(9), meetTime));
		    }
		        System.out.println(sb);
		    }
		    
		}catch(Exception e){
		    return;
		}
	}
	
	private static int checkTime(String startTime, String endTime, String checkTime) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
    LocalTime startLocalTime = LocalTime.parse(startTime, formatter);
    LocalTime endLocalTime = LocalTime.parse(endTime, formatter);
    LocalTime checkLocalTime = LocalTime.parse(checkTime, formatter);
    
    if((startLocalTime.isBefore(checkLocalTime) || startLocalTime.equals(checkLocalTime)) && (endLocalTime.isAfter(checkLocalTime) || endLocalTime.equals(checkLocalTime))){
    	return 1;
    }else{
    	return 0;
    }
    
}
	}
