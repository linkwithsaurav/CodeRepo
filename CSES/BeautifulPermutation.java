/*
A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements whose difference is 1.

Given n, construct a beautiful permutation if such a permutation exists.
*/

package com.saurav;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeautifulPermutation {
    public static void main(String[] args)throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        int i = 2, j = 1;
        boolean flag = false;
        if(number == 1) {
            sb.append(1);
            flag = true;
        }else if(number>3){
            for (; i <= number; i += 2) {
                sb.append(i).append(" ");
            }
            if (Math.abs(i - j) > 1) {
                flag = true;
                for (; j <= number; j += 2) {
                    sb.append(j).append(" ");
                }
            }
        }

        if(flag) {
            System.out.println(sb);
        }else{
            System.out.println("NO SOLUTION");
        }

    }
}
