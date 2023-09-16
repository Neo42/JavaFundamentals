package Chapter4;

import java.util.Scanner;
import java.lang.Math;

public class FractionEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        sc.close();
        double sum = 0;

        for (int denominator = 1; denominator <= n; denominator++) {
            System.out.println(denominator);
            sum += Math.pow(-1, (denominator - 1)) * (1.0 / denominator);
            System.out.println(sum);
        }
    }
}
