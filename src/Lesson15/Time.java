package Lesson15;

public class Time {

    public static void showTime() {

        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minute = -1;
            MIDDLE:
            do {
                minute++;
                if (hour > 1) {
                    break OUTER;
                }
                int second = 0;
                while (second < 60) {
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
            }
            while (minute < 59);
            hour++;
        }
    }
}










