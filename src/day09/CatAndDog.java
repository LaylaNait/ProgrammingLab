package day09;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word =scan.next();

         String s1 = "cat";
         String s2 ="dog";

         int nS1 = 0;
         int nS2 = 0;
        for (int i = 0; i < word.length(); i++) {
           if( word.substring(i).startsWith("cat")){
               nS1++;
           }
           if (word.substring(i).startsWith("dog")){
               nS2++;
           }
        }

        if (nS1 == nS2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }






    }
}
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog
output: true
input: catdog
output: true
Example:

input: catcat
output: false
input: catcat
output: false
Example:

input: cat-cheetah-dog-cat
output: false
 */