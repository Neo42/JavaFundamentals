package Chapter3;

import java.util.Scanner;

public class Eigenvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binaryNumber = sc.nextInt();
        sc.close();

        int digit = 0;
        int digitNumber = 0;
        int integer = 0;
        int binaryValue = 1;

        while (binaryNumber > 0) {
            digit++;
            digitNumber = binaryNumber % 10;
            binaryNumber = (binaryNumber - digitNumber) / 10;

            boolean isDigitNumberEven = digitNumber % 2 == 0;
            boolean isDigitEven = digit % 2 == 0;

            if (isDigitEven == isDigitNumberEven) {
                integer += binaryValue;
            }

            binaryValue *= 2;
        }

        System.out.println(integer);
    }
}