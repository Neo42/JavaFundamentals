package Chapter4;

import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int sum = 0;
        int count = 0;
        int i = 2;

        OUT: while (count < m) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    i++;
                    continue OUT;
                }
            }
            count++;
            if (count >= n) {
                sum += i;
            }
            i++;
        }

        System.out.println(sum);
    }
}
