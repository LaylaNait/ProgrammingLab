package day08;


import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String[] arr = email.split("@");
        System.out.println("Email id: "+arr[0]);
        System.out.println("Email domain: "+ arr[1]);

        if (!email.contains("@")){
            System.out.println("Invalid email");}
        if(arr.toString().contains("@")){
            System.out.println("invalid email");
        };




    }
}
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
email -> info@cybertekschool.com\-

Output:
Email id: info
Email domain: cybertekschool.com
If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email
email -> hello-gmail.com

Output:
invalid email
email -> my@fancy@email.com

Output:
invalid email
 */