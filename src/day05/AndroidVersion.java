package day05;

import java.util.Scanner;

public class AndroidVersion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();
        String result = "";
        if (version == 1.5){
            result ="Cupcake" ;
        }else if(version == 1.6){
            result = "Donut";
        }else if (version == 2.1){
            result = "Eclair";
        }else if (version ==2.2){
            result = "Froyo";
        }else if (version ==2.3){
            result = "Gingerbread";
        }else if (version == 3.1){
            result = "Honeycomb";
        }else if (version ==4.2){
            result = "Ice Cream Sandwich";
        }else if (version == 4.1){
            result = "Jelly Bean";
        }else if (version == 4.4){
            result = "KitKat";
        }else if (version == 5.0){
            result = "Lollipop";
        }else if (version == 8.0){
            result = "Oreo";
        }else if (version == 9.0){
            result = "Pie";
        }else {
            result = "Sorry, I don't know this version!";
        }
        System.out.println(result);
        input.close();











    }
}
/*
Android is one of the best operating systems in the world that helps the billion of users who use smart phones
and tablets. Also, Android versions always had some funny names related to sweets. In this assignment,
you need to write a program that will print a name of Android version, based on number.
 Please refer to the link beneath, in order to develop your if statement. https://www.javatpoint.com/android-versions

Create an object of Scanner class named scanner. (DONE)
Create double variable named version. (DONE)
Write an if statement that will print android version name based on value of the version variable.
Versions 1.5 - Cupcake 1.6 - Donut 2.1 - Eclair 2.2 - Froyo 2.3 - Gingerbread 3.1 - Honeycomb 4.0
- Ice Cream Sandwich 4.1 - Jelly Bean 4.4 - KitKat 5.0 - Lollipop 8.0 - Oreo 9.0 - Pie

Example:

input: 1.5
output: Cupcake
input: 1.5
output: Cupcake
input: 9.0
output: Pie
input: 9.0
output: Pie
input: 11.0
output: Sorry, I don't know this version!
 */