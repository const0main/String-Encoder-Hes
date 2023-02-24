package main;

import org.apache.commons.codec.binary.Hex;
import java.nio.charset.StandardCharsets;

public class Utils {

    public static String toHex(String arg) {
        return Hex.encodeHexString(arg.getBytes(StandardCharsets.UTF_8));
    }

    public static byte[] hexToString(String hex) {
        int l = hex.length();
        byte[] data = new byte[l / 2];
        for (int i = 0; i < l; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }

    public static String hes(String s){
        String hashVal = "hes_";
        byte[] mBytes = s.getBytes(StandardCharsets.UTF_8);

        String hVal = toHex(s);
        hashVal += hVal;
        return hashVal;
    }

}
