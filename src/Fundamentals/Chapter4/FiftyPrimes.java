
package Fundamentals.Chapter4;

public class FiftyPrimes {
    public static void main(String[] args) {
        int n = 2;
        int count = 0;

        while (count < 50) {
            boolean isPrime = true;

            for (int i = 2; i < n; i++) {
                if ((n % i) == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(n);
                count++;
            }

            n++;
        }
    }
}
