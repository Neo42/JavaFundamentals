package Chapter3;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count = 0;
        double sum = 0;

        do {
            double number = sc.nextInt();

            if (number == -1) {
                break;
            }

            count++;
            sum += number;
        } while (true);

        sc.close();
        double average = sum / count;
        System.out.println(average);
    }
}
