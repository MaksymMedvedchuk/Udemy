package Lessson15;

public class Time {


    public static void showTime() {


        int hour = 0;
        OUTER:
        while (hour < 6) {


            int minute = 0;
            MIDDLE:
            do {
                minute++;

            }while (minute < 60);


            int second = 0;
            INNER:
            while (second < 60) {
                second++;
            }

            System.out.println(hour + ":" + minute + ":" + second);
            hour++;
        }

        }

    }









