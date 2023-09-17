package Fundamentals.Chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int fac = 1;

        // for (int i = 2; i <= n; i++) {
        // fac *= i;
        // }

        // loop for a fixed number of times
        for (int i = n; i >= 1; i--) {
            fac *= i;
        }

        // use do while if the statement has to be run for once at the beginning
        // in other cases use while loop

        System.out.println(fac);
    }
}