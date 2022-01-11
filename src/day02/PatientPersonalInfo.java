package day02;

import java.util.Scanner;

public class PatientPersonalInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\n" +
                "Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        scan.nextLine();
        System.out.println("Enter your email");
        String email = scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhone = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneN = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean married = scan.hasNextBoolean();
        String contacts = " work phone number - "+ workPhone+", \npersonal phone number _ "+personalPhoneN+
                " and email: "+email;
        String fullName = "Full name: "+ firstName+", "+lastName;
        String address = " Address: \n"+street+", "+ city+", "+state+", "+zipcode;
        System.out.println("Patient personal information" + fullName+ address+contacts+" Age: "+age+ " Height: "+
                height+"pounds Married?: "+married);




    }
}
/*
Declare 9 String variables firstName, firstName, fullName, email, street, state, city, address, contacts.

Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight. Declare boolean variable: isMarried (for marriage status). Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

Create a Scanner object named scan.

Execution flow with example:

Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.1
Enter your weight
173.2
Are you married?
true


build contacts variable by concatenating work phone, personal phone and email

build fullName variable by concatenating first name and last name

build address variable by concatenating street, city, state, zip code

Output in the console:



 */