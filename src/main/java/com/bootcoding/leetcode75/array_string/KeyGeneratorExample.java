package com.bootcoding.leetcode75.array_string;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class KeyGeneratorExample {
    public static void main(String[] args) {
        try {
            // Create a KeyGenerator instance for AES
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            // Initialize the KeyGenerator with the key length (128 bits)
            keyGen.init(128);
            // Generate a random AES key
            SecretKey secretKey = keyGen.generateKey();
            
            // Convert the key to bytes
            byte[] keyBytes = secretKey.getEncoded();
            
            // Print the key in hexadecimal format
            System.out.println("Generated Key (Hexadecimal): ");
            for (byte b : keyBytes) {
                System.out.printf("%02X", b);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
