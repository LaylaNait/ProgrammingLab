package day07;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();


        for (char i = 0; i <word.length() ; i++) {
           char eachChar =  word.charAt(i);

            System.out.println(eachChar);
        }

        inp.close();



    }
}
/*
Given a String, use a loop to print every character from the String on a new line.

Examples:

Input: hello
h
e
l
l
o
 */