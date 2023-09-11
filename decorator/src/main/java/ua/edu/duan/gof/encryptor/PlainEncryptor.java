package ua.edu.duan.gof.encryptor;

public class PlainEncryptor implements Encryptor {
    @Override
    public String encrypt(String data) {
        System.out.println("PlainEncryptor encrypt");
        return data;
    }

    @Override
    public String decrypt(String encryptedData) {
        System.out.println("PlainEncryptor decrypt");
        return encryptedData;
    }

}
