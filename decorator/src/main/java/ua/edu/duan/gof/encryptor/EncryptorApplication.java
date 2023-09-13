package ua.edu.duan.gof.encryptor;

public class EncryptorApplication {
    public static void main(String[] args) {

        Encryptor encryptor = new AddSaltDecorator(new ReverseEncryptorDecorator(new Base64Decorator(new PlainEncryptor())));

        String encryptedString = encryptor.encrypt("Hello World");
        String decryptedString = encryptor.decrypt(encryptedString);

        System.out.println(encryptedString);

        System.out.println(decryptedString);

    }
}
