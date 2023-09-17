package Fundamentals.Chapter5;

import java.util.Scanner;

public class BiggerThanAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        int[] numbers = new int[100];
        double sum = 0;

        while (x != -1) {
            numbers[count] = x;
            count++;
            sum += x;
            x = sc.nextInt();
        }

        sc.close();

        if (count > 0) {
            double average = sum / count;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > average) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
