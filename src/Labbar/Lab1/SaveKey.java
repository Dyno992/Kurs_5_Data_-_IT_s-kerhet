package Labbar.Lab1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveKey {

    public static void saveKey(String fileName, Labbar.Lab1.KeyPair key) {
        try {
            FileOutputStream fileOut = new FileOutputStream("src\\Labbar\\Lab1\\Saved_keys\\" + fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(key);
            out.close();
            System.out.println("Successfully Generated and Saved key as " + fileName);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}