package com.bootcoding.project;

import java.security.SecureRandom;

public class PrivateKeyGenerator {
    public static void main(String[] args) {
        // Generate a private key of length 16 bytes
        byte[] privateKeyBytes = generatePrivateKey(16);
        // Convert the byte array to a hexadecimal string for representation
        String privateKeyHex = bytesToHex(privateKeyBytes);
        // Print the generated private key
        System.out.println("Generated Private Key: " + privateKeyHex);
    }
    // Method to generate a private key of specified length in bytes
    public static byte[] generatePrivateKey(int length) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] privateKey = new byte[length];
        secureRandom.nextBytes(privateKey);
        return privateKey;
    }
    // Method to convert a byte array to a hexadecimal string
    public static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}

