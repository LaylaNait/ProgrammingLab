package day09;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
         String str ="java";
         int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.substring(i).startsWith("java")){
              count++;
            }
        }
        System.out.println(count);




    }
}
/*
Print the number of times that the string "java" appears anywhere in the given string word

Example:

input: javaxjava

output: 2
input: javaxjava

output: 2
Example:

input: javaxjavaapplepearjavaegg

output: 3
 */