package ua.edu.duan.gof.encryptor;

public class EncryptorApplication {
    public static void main(String[] args) {
        Encryptor encryptor = new Base64Decorator(new ReverseEncryptorDecorator(new PlainEncryptor()));

        String encryptedString = encryptor.encrypt("Hello World");

        System.out.println(encryptedString);

        String decryptedString = encryptor.decrypt(encryptedString);
        System.out.println(decryptedString);

    }
}
