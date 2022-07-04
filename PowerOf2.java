package com.bridgeLabz.Day5_BasiccoreProblems;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.print("Please enter the power :- ");
        Scanner scanner = new Scanner(System.in);
        int powerOf = scanner.nextInt();
        int result = 1;
        int i = 1;
        for (i = 1; i <= powerOf; i++) {
            result *= 2;
            System.out.println("Number and its power " + i + " = " + result);


        }
    }
}
