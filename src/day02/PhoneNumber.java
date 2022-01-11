package day02;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter areaCode");
        int areaCode = input.nextInt();
        System.out.println("Enter localNumber");
        int localNumber = input.nextInt();
        String phoneNumber = "("+areaCode+")-"+localNumber;
        System.out.println("Calling number " + phoneNumber);





    }
}
/*
Write a program that asks user to input int values: areaCode and localNumber.

Using concatenation put together in this format and assign to String phoneNumber variable:
(222)-3334444

Write a print statement that displays (use the phoneNumber variable ):
Calling number (222)-3334444
 */