package OOP.Chapter8.Stream;

import java.io.IOException;

public class IOStream {
    public static void main(String[] args) {
        System.out.println("Hello World");
        byte[] buffer = new byte[1024];
        try {
            int length = System.in.read(buffer);
            String s = new String(buffer, 0, length);
            System.out.println("read " + length + " bytes.");
            System.out.println(s);
            System.out.println("The length of the string is " + s.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
