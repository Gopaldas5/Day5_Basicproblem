package com.bridgeLabz.Day5_BasiccoreProblems;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(".....Before the Swapping.....");
        System.out.print("Enter 1st number :- ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number :- ");
        int num2 = scanner.nextInt();
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(".....After The Swapping.....");
        System.out.println("Enter 1st number :- "+num1);
        System.out.println("Enter 2nd number :- "+num2);


    }
}
