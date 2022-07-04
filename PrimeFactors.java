package com.bridgeLabz.Day5_BasiccoreProblems;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = scn.nextInt();
        int num;

        for ( num = 2; num * num <= n; num++)
        {
            while (n % num == 0)
            {
                System.out.print(num + " ");
                n = n / num;
            }
        }
        if (n != 1)
        {
            System.out.print(n);
        }

    }
}
