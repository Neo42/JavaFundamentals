package Chapter5;

import java.util.Scanner;

public class CountVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = new int[10];
        int x = sc.nextInt();

        while (x != -1) {
            if (x < 0 || x > 9) {
                x = sc.nextInt();
            }
            counts[x]++;
            x = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < counts.length; i++) {
            System.out.println("Number " + i + " got " + counts[i] + " votes.");
        }
    }
}
