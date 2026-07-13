package Polaris.Java.core.data.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    static void main() {
        LocalTime time = LocalTime.of(23, 59, 12);
        LocalTime timeN = LocalTime.now();
        System.out.println(time);
        System.out.println(timeN);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
    }
}
