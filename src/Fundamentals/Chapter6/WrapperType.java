package Fundamentals.Chapter6;

public class WrapperType {
    public static void main(String[] args) {
        Integer i = 10;
        Integer j = new Integer(10);
        Integer k = new Integer("10");
        int iii = i;
        Integer max = Integer.MAX_VALUE;
        System.out.println(max);
        boolean isDigit = Character.isDigit('0');
        System.out.println(isDigit);
        char a = Character.toLowerCase('A');
        System.out.println(a);
    }
}
