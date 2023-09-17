package Fundamentals.Chapter7;

public class Sum {
    public static void sum(int a, int b) {
        int i;
        int sum = 0;
        for (i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public static void main(String[] args) {
        sum(1, 10);
        sum(20, 30);
        sum(35, 45);
    }
}
