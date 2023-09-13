package ua.edu.duan.gof.encryptor;



public class AddSaltDecorator extends EncryptorDecorator {
    private final static String SALT = "1234";
    public AddSaltDecorator(Encryptor encryptor) {
        super(encryptor);
    }

    @Override
    public String encrypt(String data) {
        System.out.println("Add salt encrypt");
        return super.encrypt(data + SALT);
    }

    @Override
    public String decrypt(String encryptedData) {
        System.out.println("Add salt  decrypt");
        String decripted = super.decrypt(encryptedData);
        return decripted.substring(0, decripted.length() - 4);
    }

}
