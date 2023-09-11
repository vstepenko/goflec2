package ua.edu.duan.gof.encryptor;

import org.apache.commons.lang3.StringUtils;

public class ReverseEncryptorDecorator extends EncryptorDecorator {

    public ReverseEncryptorDecorator(Encryptor encryptor) {
        super(encryptor);
    }

    @Override
    public String encrypt(String data) {
        System.out.println("ReverseEncryptorDecorator encrypt");
        return super.encrypt(StringUtils.reverse(data));
    }

    @Override
    public String decrypt(String encryptedData) {
        System.out.println("ReverseEncryptorDecorator decrypt");
        return StringUtils.reverse(super.decrypt(encryptedData));
    }
}
