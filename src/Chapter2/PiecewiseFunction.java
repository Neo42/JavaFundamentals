package Chapter2;

import java.util.Scanner;

public class PiecewiseFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        sc.close();
        int signum = Long.signum((long) x);
        switch (signum) {
            case -1:
                System.out.println(-1);
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
        }
    }
}
