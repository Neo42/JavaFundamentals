package Chapter4;

import java.util.Scanner;

public class GcdEnumeration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int divisor = 1;
        int small = a < b ? a : b;

        for (int i = 2; i <= small; i++) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
            }
        }

        System.out.println(divisor);
    }
}
