package com.bridgeLabz.Day5_BasiccoreProblems;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        int a, b, c;
        int largest;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("First number is greatest " + a);
            } else {
                System.out.println("third number is the greatest" + c);
            }
        } else {
            if (b > c) {
                System.out.println("Second number is the greatest " + b);
            } else {
                System.out.println("Third number is the greatest " + c);

            }
        }
    }
}