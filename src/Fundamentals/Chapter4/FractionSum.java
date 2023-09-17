package Fundamentals.Chapter4;

import java.util.Scanner;

public class FractionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        sc.close();
        double sum = 0;

        for (int denominator = 1; denominator <= n; denominator++) {
            System.out.println(denominator);
            sum += (1.0 / denominator);
            System.out.println(sum);
        }
    }
}