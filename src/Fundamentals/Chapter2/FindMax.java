package Fundamentals.Chapter2;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please the first number:");
        int first = sc.nextInt();
        System.out.println("Please the second number:");
        int second = sc.nextInt();
        System.out.println("Please the third number:");
        int third = sc.nextInt();
        sc.close();

        int max = 0;

        if (first > second) {
            if (first > third) {
                max = first;
            } else {
                max = third;
            }
        } else {
            if (second > third) {
                max = second;
            } else {
                max = third;
            }
        }

        System.out.println("The maximum number is: " + max);
    }
}
