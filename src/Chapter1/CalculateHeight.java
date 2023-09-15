package Chapter1;

import java.util.Scanner;

public class CalculateHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Please enter your height in foots and inches, for example: \"5 7\" stands for 5 foots and 7 inches.");
        int foots = sc.nextInt();
        int inches = sc.nextInt();
        int heightInMeters = (int) ((foots + inches / 12.0) * 0.3048 * 100);
        System.out.println("Your height in centimeters is " + heightInMeters + "m.");
        sc.close();
    }
}
