package day06;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();//craig_federighi@apple.com

        String firstName = email.substring(0,email.indexOf('_'));;
        firstName=firstName.replace(firstName.charAt(0), firstName.toUpperCase().charAt(0));
        String  lastName =email.substring(email.indexOf('_')+1,email.indexOf('@'));
       lastName = lastName.replace(lastName.charAt(0),lastName.toUpperCase().charAt(0));
        String domain = email.substring(email.indexOf('@')+1,email.indexOf('.'));
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);

      scan.close();




    }
}
/*
Write a program that will print out information about user based on email. Print first name,
last name, and domain. First and Last name should be printed with proper format
 - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */