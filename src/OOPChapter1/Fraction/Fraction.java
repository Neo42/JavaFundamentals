package OOPChapter1.Fraction;

import java.util.Scanner;

public class Fraction {
    int numerator;
    int denominator;
    int gcd;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction a = new Fraction(sc.nextInt(), sc.nextInt());
        Fraction b = new Fraction(sc.nextInt(), sc.nextInt());
        sc.close();
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5, 6)).print();
        a.print();
        b.print();
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        getGcd();
        this.numerator /= this.gcd;
        this.denominator /= this.gcd;
    }

    Fraction plus(Fraction x) {
        int numerator = this.numerator * x.denominator + x.numerator * this.denominator;
        int denominator = this.denominator * x.denominator;
        return new Fraction(numerator, denominator);
    }

    Fraction multiply(Fraction x) {
        int numerator = this.numerator * x.numerator;
        int denominator = this.denominator * x.denominator;
        return new Fraction(numerator, denominator);
    }

    void print() {
        if (numerator % denominator == 0) {
            System.out.println(numerator / denominator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    double toDouble() {
        return ((double) numerator) / denominator;
    }

    void getGcd() {
        int small = numerator < denominator ? numerator : denominator;
        int big = numerator < denominator ? denominator : numerator;
        int remainder = 0;

        while (true) {
            remainder = big % small;
            if (remainder == 0) {
                this.gcd = small;
                break;
            }
            big = small;
            small = remainder;
        }
    }
}
