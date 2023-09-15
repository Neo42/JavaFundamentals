package Chapter1;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fahrenheit = sc.nextInt();
        int celcius = (int) ((fahrenheit - 32) * 5 / 9);
        System.out.println(celcius);
        sc.close();
    }
}
