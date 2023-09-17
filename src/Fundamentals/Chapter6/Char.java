package Fundamentals.Chapter6;

public class Char {
    public static void main(String[] args) {
        char c = 'A';
        c += 'a' - 'A';
        System.out.println(c);

        int x = 'Z';
        System.out.println(x);

        int i = 'Z' - 'A';
        System.out.println(i);

        System.out.println('a' > 'Z'); // true
    }
}
