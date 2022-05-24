package com.bridgeLabz.Day5_BasiccoreProblems;

import java.util.Scanner;


public class QuotientAndRemainder {
    public static void main(String[] args) {
        int dividend;
        int divisor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Dividend:- ");
            dividend = scanner.nextInt();
        System.out.print("Enter the divisor:- ");
            divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient:- " + quotient);
        System.out.println("Remainder:- " + remainder);
    }
}
