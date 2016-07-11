package info.yannxia.java.utils;

/**
 * Created by yann on 16/7/11.
 */
public class Utils4Byte {

    public static byte[] composeByteArray(byte[] b1, byte[]... bytes) {
        byte[] newByte = new byte[0];
        for (byte[] b : bytes) {
            newByte = composeByteArray(newByte, b);
        }

        return composeByteArray(b1, newByte);
    }


    public static byte[] composeByteArray(byte[] b1, byte[] b2) {
        byte[] newByte = new byte[b1.length + b2.length];
        System.arraycopy(b1, 0, newByte, 0, b1.length);
        System.arraycopy(b2, 0, newByte, b1.length, b2.length);
        return newByte;
    }
}
