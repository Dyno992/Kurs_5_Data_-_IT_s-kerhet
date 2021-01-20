package Labbar.Lab1;


import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int bitLength = 4096;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n" + "Please name the files for your KeyPair: ");

        Labbar.Lab1.GenerateKeys.generateKeys(sc.nextLine(), bitLength);

















//        GenerateKeys.generateKeys("Jocke", bitLength);
//        KeyPair publicKey = ReadKey.readKey("Jocke_pub.key");
//        KeyPair privateKey = ReadKey.readKey("Jocke_priv.key");
//        String encrypted = Encrypt.encrypt("Pröjsa genast\n", publicKey);
//        String clear = Decrypt.decrypt(encrypted, privateKey);
//        System.out.println(clear);














        // Encrypt
        //String cipher = msg.modPow(e, n).toString();
        // Decrypt
        //String plain = new String((new BigInteger(cipher)).modPow(d, n).toByteArray());
    }
}