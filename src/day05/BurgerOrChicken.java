package day05;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String meal = scan.next();
        double priceBurCh = 10.0;
        double priceSods = 2.0;
        double priceFries = 3.5;
        if (meal.equals("burger") || meal.equals("chicken")) {
            System.out.println(priceBurCh);
        }
         if (meal.equals("soda")){
            System.out.println(priceSods);
        }
         if (meal.equals("fries")){
            System.out.println(priceFries);
        }
         scan.close();







    }
}
/*
A fast food company has two main order types, burger meal and chicken meal.

Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.

If the order is burger price is 10.0
If the order is chicken price is 10.0
If the order is soda price is 2.0
If the order is fries price is 3.5
hint: or operator in java is ||

Examples:

burger

10.0
burger

10.0
chicken

10.0
chicken

10.0
soda

2.0
 */