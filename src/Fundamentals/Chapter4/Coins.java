package Fundamentals.Chapter4;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        int coins = 10;
        Scanner sc = new Scanner(System.in);

        while (coins >= 10) {
            System.out.println("Please enter a coin number under 10:");
            coins = sc.nextInt();
        }

        sc.close();

        int fives = coins / 5;
        coins %= 5;
        int twos = coins / 2;
        coins %= 2;

        System.out.println(fives + " five dollar coins.");
        System.out.println(twos + " two dollar coins.");
        System.out.println(coins + " one dollar coins.");
    }
}
