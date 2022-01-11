package day09;

import java.util.Scanner;

public class CostomMethod {

public static void printHello (){
    System.out.println("Hello");
}
public static void printWorld (){
    System.out.println("World!");

}

public static void cube (){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
       int n2 = n= n^3;
    System.out.println(n2);
}


}
/*
Create a method called cube. It is a void method with no arguments.
 Write all required code inside this method in order to read a number from the console and
 then prints the cubed value of that number:

Example:

input: 5

output: 125
input: 5

output: 125
hint: cube of a number n = n^3 ->

n * n * n
 */