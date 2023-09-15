package Chapter1;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is an answer: " + sc.nextLine());
        sc.close();
    }
}