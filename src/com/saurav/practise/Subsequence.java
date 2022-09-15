package com.saurav.practise;

import java.util.ArrayList;

/**
 * Printing subsequence of an array
 * Subsequence is contigous set of elements appearance in an array.
 */
public class Subsequence {
    public static void main(String[] args) {

        int[] arr = new int[]{3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        printSubsequence(list, arr, idx, arr.length);


    }

    private static void printSubsequence(ArrayList<Integer> list, int[] arr, int idx, int length) {

        if(idx == length){
            System.out.println(list);
            return;
        }

        list.add(arr[idx]);
        printSubsequence(list, arr, idx+1, length);

        list.remove(list.size()-1);
        printSubsequence(list, arr, idx+1, length);

    }
}
