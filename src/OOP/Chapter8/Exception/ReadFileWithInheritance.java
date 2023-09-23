package OOP.Chapter8.Exception;

public class ReadFileWithInheritance {
    public ReadFileWithInheritance() throws OpenException {
    }

    public void f() throws OpenException {

    }
}

class OpenException extends Throwable {
}

class CloseException extends OpenException {
}

class NewException extends Exception {

}

class NewClass extends ReadFileWithInheritance {
    public NewClass() throws OpenException, NewException {
    }

    public void f() throws OpenException {
    }

    public static void main(String[] args) {
        try {
            ReadFileWithInheritance p = new NewClass();
            p.f();
        } catch (OpenException e) {
            e.printStackTrace();
        } catch (NewException e) {
        }
    }
}