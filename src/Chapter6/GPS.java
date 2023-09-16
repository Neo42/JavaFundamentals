package Chapter6;

import java.util.Scanner;

public class GPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String statement = "";
        boolean verified = false;
        boolean inputEnd = false;

        while (!verified) {
            while ((!statement.startsWith("$GPRMC")) && sc.hasNextLine()) {
                statement = sc.nextLine();
            }

            // Verification
            char[] verifiedChars = statement.substring(1, statement.length() - 3).toCharArray();
            char xor = verifiedChars[0];
            int index = 0;
            for (char c : verifiedChars) {
                index++;
                if (index == 1) {
                    continue;
                }
                xor ^= c;
            }
            verified = Integer.parseInt(statement.substring(statement.length() - 2), 16) == (int) xor;

            while (!inputEnd) {
                if (sc.nextLine().equals("END")) {
                    sc.close();
                    inputEnd = true;
                }
            }
        }

        long utcTime = Math.round(Math.floor(Double.parseDouble(statement.split(",")[1])));
        System.out.println(utcTime);

        long bjHour = (utcTime / 10000 + 8 > 24) ? (utcTime / 10000 + 8 - 24) : (utcTime / 10000 + 8);
        utcTime -= 10000 * (utcTime / 10000);
        long bjMinute = utcTime / 100;
        utcTime -= 100 * bjMinute;

        System.out.println(bjHour + ":" + bjMinute + ":" + utcTime);
    }
}
