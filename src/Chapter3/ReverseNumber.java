package Chapter3;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        String output = "";
        int count = 0;

        while (input > 0) {
            int digit = input % 10;
            count++;
            if (!(count == 1 && digit == 0)) {
                output = output + digit;
            }
            input = (input - digit) / 10;
        }

        System.out.println(output);
    }
}
