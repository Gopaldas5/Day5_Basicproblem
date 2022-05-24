package com.bridgeLabz.Day5_BasiccoreProblems;
import java.util.Scanner;

public class Flipcoin{
    public static void main(String[] args) {

        System.out.println("Enter number of times to flip the coin");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int loopCount = 0;
        double result;
        double heads = 0.0;
        while(loopCount <= number)
        {
            result = Math.random();
            if(result <= .5){
                System.out.println("The result is heads.");
                heads++;
            }
            else
                System.out.println("The result is tails.");
             loopCount ++;
        }
        double percentHeads = heads/number*100;
        double percentTails = (number-heads)/number*100;
        System.out.println("The percentage of heads is: " +percentHeads);
        System.out.println("The percentage of tails is: " +percentTails);
    }
}

