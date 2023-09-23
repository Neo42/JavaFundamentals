package OOP.Chapter8.Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
    public static void main(String[] args) {
        System.out.println("Hello World");
        byte[] buffer = new byte[10];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (byte) i;
        }
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("a.dat")));
            int i = 123456;
            out.writeInt(i);
            out.close();
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("a.dat")));
            int j = in.readInt();
            in.close();
            System.out.print(j);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
