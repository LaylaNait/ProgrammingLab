package day06;

import java.util.Scanner;

public class LenghtOfWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        if (word1.length()>word2.length()){
            System.out.println(word1);
        }
       if (word2.length()>word1.length()){
           System.out.println(word2);
       }


     scan.close();



    }
}
/*
Write a program that will print out the longest word. Note: Assume the length of the two given
Strings will be different

input:
bill
check
input:
bill
check
output: check
 */