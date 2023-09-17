package Fundamentals.Chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        int[] coefficients = new int[100];

        Arrays.fill(coefficients, 0);

        Scanner sc = new Scanner(System.in);
        int degree;
        int coefficient;
        String polynomial = "";

        while (sc.hasNextInt()) {
            degree = sc.nextInt();
            coefficient = sc.nextInt();
            coefficients[degree] += coefficient;
        }
        sc.close();

        for (int i = coefficients.length - 1; i >= 0; i--) {
            if (coefficients[i] == 0) {
                continue;
            }
            polynomial += i == 0 ? coefficients[i] : coefficients[i] + "x" + i + "+";
        }

        System.out.println();
        System.out.println();
        System.out.println(polynomial);
    }
}
