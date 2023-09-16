package Chapter6;

// import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        String s = new String("a string");
        // Scanner sc = new Scanner(System.in);
        // String next = sc.next();
        // sc.close();
        // System.out.println(next);
        String person1 = "Fred";
        String person2 = "Jill";
        person2 = "Fred";
        System.out.println(person1.equals(person2));
        System.out.println(person1 == person1);
        // Remember to Compare strings using .equals
        System.out.println(person1.equals("Fred"));
        System.out.println(person1.compareTo(person2));
        System.out.println(person1.compareToIgnoreCase(person2));
        System.out.println(person1.length());
        System.out.println(person1.charAt(0));
        System.out.println(person2.substring(2));
        System.out.println(person2.indexOf("F"));
        System.out.println(person2.lastIndexOf("F"));
    }
}
