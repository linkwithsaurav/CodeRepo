/*
You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

On each move, you may increase the value of any element by one. What is the minimum number of moves required?
*/
package com.saurav;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IncreasingArray {
    public static void main(String[] args)throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringBuilder sb = new StringBuilder();
        int length = Integer.parseInt(br.readLine());
        String input[] = br.readLine().trim().split(" ");
        int arr[] = new int[input.length];
        for(int i = 0; i<arr.length; ++i){
            arr[i] = Integer.parseInt(input[i]);
        }

        long moves = 0;
        for(int i = 0, j = i+1; j<length;++i,++j){
            if(arr[i]>arr[j]){
                moves+=arr[i]-arr[j];
                arr[j] = arr[i];
            }
        }
        System.out.println(moves);
    }
}
