package day09;

import java.util.Scanner;

public class countHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
   String s1 = "hi";
     int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("hi")){
                count++;
            }
        }

        System.out.println(count);
    }
}
/*
Print out the number of times that the string "hi" appears anywhere in the given string.
 Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2
input: abc hi how hi

output: 2
Example:

input: hi code java please

output: 1
 */