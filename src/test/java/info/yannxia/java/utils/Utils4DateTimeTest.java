package info.yannxia.java.utils;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;


public class Utils4DateTimeTest {

    private final Logger logger = LoggerContext.getContext().getLogger(Utils4DateTimeTest.class.getName());

    @Test
    public void testIsBetween() {

        LocalDateTime dateTime = LocalDateTime.parse("2015-10-19T12:00:00");
        LocalDateTime start = LocalDateTime.parse("2015-10-19T00:00:00");
        LocalDateTime end = LocalDateTime.parse("2015-10-20T00:00:00");

        Assert.assertTrue(Utils4DateTime.isBetween(dateTime, start, end));
    }

}
