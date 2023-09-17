package Fundamentals.Chapter5;

import java.util.Scanner;

public class ExistsInArray {
    public static void main(String[] args) {
        int[] data = { 2, 3, 5, 7, 4, 9, 11, 34, 12, 28 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        boolean doesExist = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == n) {
                doesExist = true;
                System.out
                        .println(
                                "The number " + n + " does exist in the array");
            }
        }

        if (!doesExist) {
            System.out.println(
                    "The number " + n + " doesn't exist in the array");
        }
    }
}
