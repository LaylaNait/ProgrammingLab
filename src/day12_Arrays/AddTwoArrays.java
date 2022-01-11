package day12_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);
        inp.close();



    }

    public static void add_to_r(int[] r,int n) {
     int[]newArr = new int [r.length+1];

        for (int i = 0; i < r.length; i++) {
            newArr[i] =r[i];

        }
        newArr[newArr.length-1] =n;
        System.out.println(Arrays.toString(newArr));

    }
}
/*
add_to_r is a method that accepts an array and a number.

The method takes the same value of the array but adds the given number into the array at the end. Note:
 The new number is added which means there is a size difference between the two arrays

Example:

method input: add_to_r(new int{1,5,77,8}  ,2)
​
outputs (int array):
[1, 5, 77, 8, 2]
 */