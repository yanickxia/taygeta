package info.yannxia.java.utils;

import java.util.Arrays;


public abstract class Utils4Bean {

    /**
     * most of time. if pass one param to it, will more quick
     *
     * @param o object
     * @return true is null, false is not null
     */
    public static boolean isNotNull(Object o) {
        return o != null;
    }

    public static boolean isNotNull(Object o, Object... os) {
        return Arrays.asList(o, os).stream().allMatch((i) -> i != null);
    }
}
