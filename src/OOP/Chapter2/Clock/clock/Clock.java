package OOP.Chapter2.Clock.clock;

import OOP.Chapter2.Clock.display.led.Display;

public class Clock {
    private Display hour;
    private Display minute;
    private Display second;

    public Clock(int hour, int minute, int second) {
        this.hour = new Display(hour, 24);
        this.minute = new Display(minute, 60);
        this.second = new Display(second, 60);
    }

    public void tick() {
        second.increase();
        if (second.getValue() == 0) {
            minute.increase();
        }
        if (minute.getValue() == 0) {
            hour.increase();
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(), second.getValue());
    }
}
