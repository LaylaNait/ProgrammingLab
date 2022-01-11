package day10_ArrayList;


import java.util.Collections;
import java.util.Scanner;

public class ArrayList {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }


        System.out.println(swap(list, pos1, pos2));
     in.close();
    }


    public static java.util.ArrayList<String> swap(java.util.ArrayList<String> list, int pos1, int pos2) {
        Collections.swap(list, pos1, pos2);
        return list;
    }


}





/*
The next two methods are .size() and .get().
If we have an ArrayList called someList and an Array called arr, these two do the same thing:
someList.size()
​
arr.length
someList.size()
arr.length
In other words, .size() returns the length (size) of the list.
The method .get(i) will return the element found at index i. The following two expressions also do the same thing:
someList.get(4)
​
arr[4]
someList.get(4)
arr[4]
Task: Given an ArrayList of Integers called list, find and print the sum of all the numbers in the list
 */