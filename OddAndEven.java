package com.bridgeLabz.Day5_BasiccoreProblems;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number :- ");
        int num = scanner.nextInt();

        if(num % 2 == 0)
            System.out.println( "It is even number :- "+num);
        else
            System.out.println("It is odd number :- "+num);
    }
}
