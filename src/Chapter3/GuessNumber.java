package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n = rand.nextInt(11);
        System.out.println(n);
        int guess = 0;

        System.out.println("Please enter you guess:");
        guess = sc.nextInt();

        while (guess != n) {
            System.out.println("Incorrect. Please enter you guess again:");
            guess = sc.nextInt();
        }

        sc.close();
        System.out.println("Hooray! You got it!");
    }
}
