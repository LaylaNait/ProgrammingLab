package day10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineRs(strs,strs2));

  in.close();


    }

    public static ArrayList<String>combineRs (String[]r1,String[]r2){
        ArrayList<String>combineRs = new ArrayList<>();
        combineRs.addAll(Arrays.asList(r1));
        combineRs.addAll(Arrays.asList(r2));
        return combineRs;
    }
}
/*
Finish the combineRs method to combine the two given String arrays into one arraylist and return the arraylist.

for example:

combineRs(["f","o","o"],[" b","a","r"])
​
returns [f, o, o, b, a, r]
combineRs(["f","o","o"],[" b","a","r"])

returns [f, o, o, b, a, r]
combineRs(["1","2","3"],["4"])
​
returns [1, 2, 3, 4]
 */