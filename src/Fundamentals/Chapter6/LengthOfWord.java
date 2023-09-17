package Fundamentals.Chapter6;

import java.util.Scanner;

public class LengthOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rawInput = sc.nextLine().replace(".", "");
        sc.close();
        String[] words = rawInput.split(" ");
        String output = "";
        for (String word : words) {
            output += word.length() + " ";
        }
        output = output.trim();
        System.out.println(output);
    }
}
