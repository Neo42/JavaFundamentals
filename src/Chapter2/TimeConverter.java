package Chapter2;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        int bjtHour = input / 100;
        int bjtMinute = input % 100;
        int utcHour = 0;

        if (bjtHour > 8) {
            utcHour = bjtHour - 8;
        } else {
            utcHour = bjtHour - 8 + 24;
        }

        int utcTime = utcHour * 100 + bjtMinute;
        System.out.println(utcTime);
    }
}
