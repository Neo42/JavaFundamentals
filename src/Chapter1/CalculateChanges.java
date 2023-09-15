package Chapter1;

import java.util.Scanner;

public class CalculateChanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much is this product?");
        int price = sc.nextInt(); // java.util.InputMismatchException
        System.out.println("How much would you like to pay?");
        final int bill = sc.nextInt();
        int change = bill - price;
        System.out.println("The change is: " + change);
        sc.close();
    }
}
