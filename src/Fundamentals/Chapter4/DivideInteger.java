package Fundamentals.Chapter4;

import java.util.Scanner;

public class DivideInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int mode = 1;
        int t = x;
        while (t > 9) {
            mode *= 10;
            t /= 10;
        }

        while (mode >= 1) {
            System.out.println(x / mode);
            x %= mode;
            mode /= 10;
        }
    }
}
