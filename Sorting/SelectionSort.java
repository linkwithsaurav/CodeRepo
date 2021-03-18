package com.saurav;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args)throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        int len = input.length;
        int[] arr = new int[len];
        for(int i = 0; i<len; ++i){
            arr[i] = Integer.parseInt(input[i]);
        }
        for(int i = 0; i<len-1; ++i){
            boolean flag = false;
            for(int j = i+1; j<len; ++j){
                if(arr[i]>arr[j]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
       
            if(!flag) break;
        }
        System.out.println(Arrays.toString(arr));

    }
}
