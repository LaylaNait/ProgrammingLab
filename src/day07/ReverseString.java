package day07;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
          String result = "";
        for (int i =word.length(); i >=0; i++) {
          result+=   word.charAt(i);


        }
        System.out.println(result);

       scan.close();

    }
}
/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
 If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!".
 Otherwise, reverse this word and print out result into the console.

Example:

input: cat

output: Too short!
input: cat

output: Too short!
input: singularity

output: Too long!
input: singularity

output: Too long!
input: apple

output: elppa
 */