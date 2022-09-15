package com.saurav.practise;

import java.util.ArrayList;

public class FirstSubsequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5};
        ArrayList<Integer> list = new ArrayList<>();
        int k = 6;
        firstSubsequenceOnly(list, arr, arr.length, 0, k,0);

    }

    private static Boolean firstSubsequenceOnly(ArrayList<Integer> list, int[] arr, int length, int i, int k,int sum) {

        if(i == length){
            if(sum == k) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        sum+=arr[i];
        list.add(arr[i]);
        if(firstSubsequenceOnly(list, arr, length, i+1, k,sum)){
            return true;
        }

        sum-=arr[i];
        list.remove(list.size()-1);
        return firstSubsequenceOnly(list, arr, length, i + 1, k, sum);


    }
}
