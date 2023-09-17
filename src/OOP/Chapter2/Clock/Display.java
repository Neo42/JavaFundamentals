package OOP.Chapter2.Clock;

public class Display {
    private int value = 0;
    private int limit = 0;

    public Display(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    public void increase() {
        value++;
        if (value == limit) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }
}
