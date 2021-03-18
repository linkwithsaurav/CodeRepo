package com.saurav;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args)throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        int len = input.length;
        int[] arr = new int[len];
        for(int i = 0; i<len; ++i){
            arr[i] = Integer.parseInt(input[i]);
        }

        for(int i = 1; i<len; ++i){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[++j] = key;            
        }
      System.out.println(Arrays.toString(arr));
    }

}
