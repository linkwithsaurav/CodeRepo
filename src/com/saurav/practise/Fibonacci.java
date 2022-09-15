package com.saurav.practise;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibNumber(n));

    }

    private static int fibNumber(int number){

        if(number<=1) return number;

        int last = fibNumber(number-1);
        int secondLast = fibNumber(number-2);

        return last+secondLast;
    }
}
