package GroupTsks;

import java.util.ArrayList;
import java.util.Arrays;

public class interviewQ {
    public static void main(String[] args) {
      //1
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(list);
        list.removeIf(p->p.equals("Ahmed"));
        System.out.println(list);
     //2



    }
}
/*
1  ArrayList(1) -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed

2  ArrayList (2) -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

3  ArrayList(3) -- sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method

4  ArrayList (4)-- sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method
 */