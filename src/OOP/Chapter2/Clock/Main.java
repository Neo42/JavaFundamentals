package OOP.Chapter2.Clock;

import java.util.Scanner;

import OOP.Chapter2.Clock.clock.Clock;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clock clock = new Clock(sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.close();
        clock.tick();
        System.out.println(clock);
    }
}
