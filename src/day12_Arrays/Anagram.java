package day12_Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine().toLowerCase(), in.nextLine().toLowerCase()));

    in.close();

    }


    public static boolean isAnagram(String word1, String word2) {
        boolean isAnagram = true;
        char [] w1 =word1.toCharArray();
        char []w2 = word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        if (Arrays.equals(w1, w2)){
            isAnagram=true;
        }else {
            isAnagram =false;
        }
        return  isAnagram;
    }






}


/*
Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

The isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive
Examples:

isAnagram("listen", "Silent") ==> true
isAnagram("listen", "Silent") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("star", "rats") ==> true
isAnagram("star", "rats") ==> true
isAnagram("hi", "bye") ==> false
isAnagram("hi", "bye") ==> false
isAnagram("java", "cava") ==> false
 */