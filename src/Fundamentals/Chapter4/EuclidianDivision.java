package Fundamentals.Chapter4;

import java.util.Scanner;

public class EuclidianDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int small = a < b ? a : b;
        int big = a < b ? b : a;
        int remainder = 0;

        while (true) {
            remainder = big % small;
            if (remainder == 0) {
                System.out.println("The greatest common factor of " + a + " and " + b + " is " + small + ".");
                break;
            }
            big = small;
            small = remainder;
        }
    }
}
