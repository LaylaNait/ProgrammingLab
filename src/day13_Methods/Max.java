package day13_Methods;

public class Max {


 public static int max (int x,int max)  {
     int bigger = 0;
     if (x>max)
         bigger =x;
     else if (max>x)
         bigger = max;
     return bigger;
 }



}




/*
Finish the method max which has two parameters, x and max.

if x is bigger than max return x
if max is bigger than x return max
all other cases return x
Example:

max(1,10) -> 10
max(1,10) -> 10
max(11,5) -> 11




 */