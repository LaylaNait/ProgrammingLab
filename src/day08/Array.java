package day08;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        for (int j = 0; j < nums.length; j++) {

            int even = nums[j];
            int frequecy = 0;
            for (int i = 0; i < nums.length; i++) {

                if (even % 2 == 0) {
                    frequecy++;
                }
                System.out.println(frequecy);
            }


        }
    }
}