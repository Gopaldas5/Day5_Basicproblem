package com.bridgeLabz.Day5_Basiccore;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter  Year :- ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("This is a leap year :- ");
        else
            System.out.println("This is not a leap year :- ");
    }
}
