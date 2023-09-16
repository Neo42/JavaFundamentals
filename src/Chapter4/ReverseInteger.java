package Chapter4;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int y = 0;

        do {
            y = 10 * y + x % 10;
            x /= 10;
        } while (x > 0);

        System.out.println(y);
    }
}
