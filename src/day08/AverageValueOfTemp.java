package day08;

import java.util.Scanner;

public class AverageValueOfTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
         double sum = 0;
        for (int i = 0; i < temps.length; i++) {
            sum +=temps[i];

        }
        double averageT = sum/temps.length;
        System.out.println(averageT);


    }
}
/*
Given an array temps with temperature values find and print the average value

Example:

input: 80 88 88 84 82 78 60 68

output: 78.5
 */