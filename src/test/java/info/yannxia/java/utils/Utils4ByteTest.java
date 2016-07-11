package info.yannxia.java.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yann on 16/7/11.
 */
public class Utils4ByteTest {


    @Test
    public void testComposeByteArray() {
        byte[] b = new byte[]{'a', 'b', 'c'};
        Assert.assertArrayEquals(b, Utils4Byte.composeByteArray(b));

        byte[] c = new byte[]{'d', 'e'};
        Assert.assertTrue(Utils4Byte.composeByteArray(b, c).length == b.length + c.length);
        Assert.assertTrue(Utils4Byte.composeByteArray(b, c)[Utils4Byte.composeByteArray(b, c).length - 1] == 'e');
    }

}
