package OOP.Chapter8.Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Encode {
    public static void main(String[] args) {
        System.out.println("Hello World");
        byte[] buffer = new byte[10];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (byte) i;
        }
        try {
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("a.txt"), "utf8")));
            int i = 123456;
            out.println(i);
            out.close();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("encode.txt")));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
