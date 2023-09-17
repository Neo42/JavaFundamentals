package Fundamentals.Chapter2;

import java.util.Scanner;

public class SignalReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rs = sc.nextInt();
        sc.close();

        int r = rs / 10;
        int s = rs % 10;

        String rReport = "";
        String sReport = "";

        switch (r) {
            case 1:
                rReport = "Unreadable";
                break;
            case 2:
                rReport = "Barely readable, occasional words distinguishable";
                break;
            case 3:
                rReport = "Readable with considerable difficulty";
                break;
            case 4:
                rReport = "Readable with practically no difficulty";
                break;
            case 5:
                rReport = "Perfectly readable";
                break;
        }

        switch (s) {
            case 1:
                sReport = "Faint signals, barely perceptible";
                break;
            case 2:
                sReport = "Very weak signals";
                break;
            case 3:
                sReport = "Weak signals";
                break;
            case 4:
                sReport = "Fair signals";
                break;
            case 5:
                sReport = "Fairly good signals";
                break;
            case 6:
                sReport = "Good signals";
                break;
            case 7:
                sReport = "Moderately strong signals";
                break;
            case 8:
                sReport = "Strong signals";
                break;
            case 9:
                sReport = "Extremely strong signals";
                break;
        }

        System.out.println(sReport + ", " + rReport);
    }
}
