package day13_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        String[] city = {"lrt", "dac", "nbc","asa","wtr","dgg"};
        ArrayList<String> n = new ArrayList<>(Arrays.asList(city));
        int a = n.size();
        for (String each : n) {
            String rev = "";
            for (int i = each.length()-1; i >= 0; i--) {
                rev += each.charAt(i);
            }
            n.set(a, rev);
        }
        System.out.println(n);


    }
}