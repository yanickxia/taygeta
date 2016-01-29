package info.yannxia.java.utils;

import java.time.LocalDateTime;


public class Utils4DateTime {

    public static boolean isBetween(LocalDateTime dateTime, LocalDateTime start, LocalDateTime end) {
        return dateTime.isAfter(start) && dateTime.isBefore(end);
    }
}
