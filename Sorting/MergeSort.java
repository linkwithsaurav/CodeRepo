package com.saurav;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args)throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().trim().split(" ");
        int len = input.length;
        int arr[] = new int[len];
        for(int i = 0; i<len; ++i){
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int @NotNull [] mergeSort(int[] arr){
        int n = arr.length;
        if(n == 1){
            return arr;
        }

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0,n/2));
        int[] right = mergeSort(Arrays.copyOfRange(arr, n/2,n));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int len1 = left.length, len2 = right.length;
        int i = 0, j = 0;
        int totalLength = len1+len2;
        int[] arr = new int[totalLength];


        for(int k = 0; k<totalLength; ++k){

            if(i<len1 && j<len2) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i++];
                } else if (left[i] > right[j]) {
                    arr[k] = right[j++];
                }
            }
            else{
                if(i<len1 && j>=len2){
                    arr[k] = left[i++];
                }else if(j<len2 && i>=len1){
                    arr[k] = right[j++];
                }
            }
        }
        return arr;
    }
}
