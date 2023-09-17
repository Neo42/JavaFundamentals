package Fundamentals.Chapter3;

import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oddCount = 0;
        int evenCount = 0;

        while (num != -1) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = sc.nextInt();
        }

        sc.close();
        System.out.println(oddCount + " " + evenCount);
    }
}
