package day04;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();
       int max = (num1>num2)? num1:num2;
        System.out.println(max);

scan.close();





    }
}
/*
Write an expression using the conditional operator (? :) that compares the values of the variables num1 and num2.
 The result (that is the value) of this expression should be the value of the larger of the two variables.
 The larger value should be printed out.

Ex:
  Enter number1:
  10
  Enter number2:
  20

output:
  20
 */