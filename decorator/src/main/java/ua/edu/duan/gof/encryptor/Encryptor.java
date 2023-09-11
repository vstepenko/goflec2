package ua.edu.duan.gof.encryptor;

public interface Encryptor {

    String encrypt(String data);

    String decrypt(String encryptedData);

}
