package com.saurav.practise;

import java.util.ArrayList;

public class CountOfSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int sum = 2;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(countOfSubsequenceReturned(list, arr, arr.length, 0, sum, 0));


    }

    private static Integer countOfSubsequenceReturned(ArrayList<Integer> list, int[] arr,int length,  int idx, int k, int sum){

        if(idx == length){
            if(sum == k){
                return 1;
            }
            return 0;
        }

        sum+=arr[idx];
        list.add(arr[idx]);
        int left = countOfSubsequenceReturned(list, arr, length, idx+1, k, sum);

        sum-=arr[idx];
        list.remove(list.size()-1);
        int right = countOfSubsequenceReturned(list, arr, length, idx+1, k, sum);

        return left+right;
    }
}
