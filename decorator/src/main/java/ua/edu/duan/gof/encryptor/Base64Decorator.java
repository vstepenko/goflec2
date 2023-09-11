package ua.edu.duan.gof.encryptor;


import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Decorator extends EncryptorDecorator{
    public Base64Decorator(Encryptor encryptor) {
        super(encryptor);
    }

    @Override
    public String encrypt(String data) {
        System.out.println("Base64Decorator encrypt");
        return super.encrypt(Base64.getEncoder().encodeToString(data.getBytes(StandardCharsets.UTF_8)));
    }

    @Override
    public String decrypt(String encryptedData) {
        System.out.println("Base64Decorator decrypt");
        return new String(Base64.getDecoder().decode(super.decrypt(encryptedData)), StandardCharsets.UTF_8);
    }

}
