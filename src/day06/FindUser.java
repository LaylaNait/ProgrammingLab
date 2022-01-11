package day06;

import java.util.Scanner;

public class FindUser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String f = scan.nextLine();
        String fullName1 = "Alan Wake";
        String fullName2 = "Max Payne";



       if (f.equalsIgnoreCase(fullName1)|| f.equalsIgnoreCase(fullName2)){
           System.out.println("User found!");
       }else {
           System.out.println("User not found!");
       }

      scan.close();

    }
}
/*
Write a program that will look up a user.

Assume that you have only 2 users: Max Payne and Alan Wake. First, ask user to enter full name.
 Display message: "Enter full name:". Then take input from user. If name is equals to either "Max Payne"
  or "Alan Wake", display message: "User found!". Otherwise, display message: "User not found!".
  Please make your search case insensitive!

Example:

Display message: Enter full name:
Display message: Enter full name:
input: Max Payne
input: Max Payne
Display message: User found!
 */