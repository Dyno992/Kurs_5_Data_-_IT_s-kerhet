package Labbar.Lab1;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Decrypt {

    public static String decrypt(String message, KeyPair key) {
        String msg = new String(message.getBytes(StandardCharsets.UTF_8));
        return new String((new BigInteger(msg)).modPow(key.getKey(), key.getN()).toByteArray());
    }
}