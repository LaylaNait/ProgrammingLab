package day02;

import java.util.Scanner;

public class NumberOfHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSecond = input.nextInt();
        int hour = inputSecond/3600;
        int minute = (inputSecond-3600*hour)/60;
        int second = inputSecond % 60;
        System.out.println( hour + " hour, "+minute+" minutes, and "+second+" seconds");












    }
}
/*
Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

Create a Scanner object
Declare int variables inputSeconds, hours, minutes, seconds
Ask user enter seconds by printing:

"Enter seconds:"

Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.

Assign values to the hours, minutes, seconds variables

Display the result.

Example:

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */