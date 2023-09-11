package ua.edu.duan.gof.encryptor;

public abstract class EncryptorDecorator implements  Encryptor {

    private Encryptor encryptor;

    public EncryptorDecorator(Encryptor encryptor){
        this.encryptor = encryptor;
    }

    @Override
    public String encrypt(String data) {
        return encryptor.encrypt(data);
    }

    @Override
    public String decrypt(String encryptedData) {
        return encryptor.decrypt(encryptedData);
    }
}
