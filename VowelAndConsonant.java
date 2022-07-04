package com.bridgeLabz.Day5_BasiccoreProblems;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Alphabet :- ");
        char alp = scanner.next().charAt(0);

        if(alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o'
                || alp == 'u' || alp == 'A' || alp == 'E' || alp == 'I'
                || alp == 'O' || alp == 'U')
            System.out.println("  It is vowel :- " +alp);
        else
            System.out.println( "It is consonant :- "+alp);

    }
}
