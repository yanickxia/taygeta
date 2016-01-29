package info.yannxia.java.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public abstract class Utils4File {

    public static InputStream openFileFromURL(String url) throws IOException {
        URL u = new URL(url);
        return u.openStream();
    }
}
