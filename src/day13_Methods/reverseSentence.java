package day13_Methods;

import java.util.Arrays;

public class reverseSentence {
    public static void main(String[] args) {


        String sentence = "Java is fun";

        String reverse = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reverse += sentence.charAt(i);
        }
        String[] str = reverse.split(" ");
        String result = "";

        for (String each : str) {
            String revEach = "";
            for (int i = each.length()-1; i >=0; i--) {
                revEach +=each.charAt(i);
            }
            result +=revEach + " ";
        }

        System.out.println(result);
    }
}
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun
​
reversed > fun is Java
 */