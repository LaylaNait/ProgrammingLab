package day05;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word = scan.next();
        System.out.print(word.charAt(0));
        System.out.print(word.charAt(word.length()-1));



        scan.close();
    }
}
