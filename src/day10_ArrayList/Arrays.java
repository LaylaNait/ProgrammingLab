package day10_ArrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        AbstractList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        int sum = 0;
        for (Integer each : list) {
            sum +=each;
        }
        System.out.println(sum);

    }
}
/*
the next two methods are .size() and .get().

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