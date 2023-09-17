package Fundamentals.Chapter2;

public class CompareDoubles {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(a == b); // false
        System.out.println(Math.abs(a - b) < 0.00001); // true
    }
}