package Fundamentals.Chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        List<Integer> primeDivisors = getPrimeDivisors(number);
        printResult(primeDivisors, number);
    }

    public static List<Integer> getPrimes() {
        boolean[] isPrime = new boolean[100000];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int k = 2; i * k < isPrime.length; k++) {
                    isPrime[i * k] = false; // mark all number that can be divided by i as non-prime numbers.
                }
            }
        }

        List<Integer> primes = new ArrayList<Integer>();

        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i] && i >= 2 && i <= 100000) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static List<Integer> getPrimeDivisors(int number) {
        List<Integer> primes = getPrimes();
        List<Integer> primeDivisors = new ArrayList<Integer>();
        MAIN: while (number > 1) {
            for (Integer prime : primes) {
                if (number % prime == 0) {
                    primeDivisors.add(prime);
                    number /= prime;
                    continue MAIN;
                }
            }
        }
        return primeDivisors;
    }

    public static void printResult(List<Integer> primeDivisors, int number) {
        String result = number + "=";

        for (Integer primeDivisor : primeDivisors) {
            result += primeDivisor + "x";
        }

        result = result.substring(0, result.length() - 1);
        System.out.println(result);
    }
}
