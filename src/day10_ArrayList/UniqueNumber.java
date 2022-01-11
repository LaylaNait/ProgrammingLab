package day10_ArrayList;

import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
        scan.close();

    }

 public static void printUniqueNumbers(int []nums){
        int count = 0;
     for (int i = 0,j=0; i < nums.length; i++,j++) {
         if (nums[j]==nums[i]){
             count++;
         }
         if (count==1){
             System.out.println(nums[i]);
         }
     }

 }

}
/*
Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints.
 Every single unique int should be printed from the new line.
 */