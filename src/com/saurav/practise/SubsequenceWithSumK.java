package com.saurav.practise;

import java.util.ArrayList;

public class SubsequenceWithSumK {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int k = 2;
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequence(list, arr, 0, arr.length, k, 0);


    }

    private static void printSubsequence(ArrayList<Integer> list, int[] arr, int i, int length, int k, int sum) {

        if(i == length){
            if(sum == k){
                System.out.println(list);
            }
            return;
        }

        sum+=arr[i];
        list.add(arr[i]);
        printSubsequence(list, arr, i+1, length, k, sum);

        sum-=arr[i];
        list.remove(list.size()-1);
        printSubsequence(list, arr, i+1, length, k, sum);


    }
}
