package day10_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        System.out.println(Arrays.toString(do_switch(arr)));
        in.close();
    }


    public static int[] do_switch(int[] arr) {
       int firstElement = arr[0];
       int lasElement = arr[arr.length-1];
       arr[0]=lasElement;
        arr[arr.length-1]=firstElement;
        return arr;

    }


}
/*
Implement the do_switch method Switch the last element in an array with the first and return the array.

Examples:

do_switch([1,2,3,4])

returns:[4,2,3,1]
do_switch([1,2,3,4])

returns:[4,2,3,1]
do_switch([7,2,3,5])

returns:[5,2,3,7]
 */