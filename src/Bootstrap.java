import main.Utils;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Bootstrap {

    public static void main(String[] args) {

        String[] spl = Utils.hes("Server data").split("_");
        String toStr = new String(Utils.hexToString(spl[1]), StandardCharsets.UTF_8);
        System.out.println("Encode text: " + Utils.hes("Server data"));
        System.out.println("Decode text: " + toStr);

    }

}