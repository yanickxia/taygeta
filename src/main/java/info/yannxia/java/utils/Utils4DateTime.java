package info.yannxia.java.utils;

import java.time.LocalDateTime;

/**
 * Created by yann on 15/10/20.
 */
public class Utils4DateTime {

    public static boolean isBetween(LocalDateTime dateTime, LocalDateTime start, LocalDateTime end) {
        return dateTime.isAfter(start) && dateTime.isBefore(end);
    }
}
