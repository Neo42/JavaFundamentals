package OOP.Chapter8.Exception;

class OpenException extends Throwable {
}

class CloseException extends OpenException {
}

public class ReadFile {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (OpenException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Anything");
        }
    }

    public static int open() {
        int[] a = new int[10];
        a[10] = 10;
        return -1;
    }

    public static void readFile() throws OpenException, CloseException {
        if (open() == -1) {
            throw new CloseException();
        }
    }
}
