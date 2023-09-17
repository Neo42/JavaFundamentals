package Fundamentals.Chapter4;

import java.util.Scanner;

public class ReadInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        String result = x < 0 ? "fu" : "";
        x = x > 0 ? x : -x;
        String number = "";

        int mode = 1;
        int t = x;
        while (t > 9) {
            mode *= 10;
            t /= 10;
        }

        while (mode >= 1) {
            switch (x / mode) {
                case 1:
                    number = " yi";
                    break;
                case 2:
                    number = " er";
                    break;
                case 3:
                    number = " three";
                    break;
                case 4:
                    number = " si";
                    break;
                case 5:
                    number = " wu";
                    break;
                case 6:
                    number = " liu";
                    break;
                case 7:
                    number = " qi";
                    break;
                case 8:
                    number = " ba";
                    break;
                case 9:
                    number = " jiu";
                    break;
                case 0:
                    number = " ling";
                    break;
            }

            result += number;
            x %= mode;
            mode /= 10;
        }

        System.out.println(result);
    }
}
