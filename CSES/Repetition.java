/*
You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence.
This is a maximum-length substring containing only one type of character.
*/

package com.saurav;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Repetitions {

    public static void main(String[] args)throws Exception {

        final BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        final StringBuilder sb = new StringBuilder();
        char[] input = br.readLine().trim().toCharArray();
        int len = 1;
        int maxlen = len;
        for(int i = 1, j = i-1; i<input.length;){
            if(input[i] == input[j]){
                len++;
                maxlen = Math.max(maxlen, len);
            }else{
                len = 1;
                j = i;
            }
            ++i;
        }

        System.out.println(maxlen);

    }
}
