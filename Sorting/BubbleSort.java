/*
Bubble sort with little optimization
*/

package com.saurav;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        final BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String input[] = br.readLine().trim().split(" ");
        int length = input.length;
        int arr[] = new int[length];
        for (int i = 0; i < length; ++i) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < length; ++i) {
            int count = 0;
            for (int j = 0; j < length - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else {
                    count++;
                }
            }
            if (count == length - 1 - i) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

   
