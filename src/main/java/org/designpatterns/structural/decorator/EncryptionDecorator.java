package org.designpatterns.structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encrypt(data);
        System.out.println("-> Encrypting data");
        super.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String encryptedData = super.readData();
        System.out.println("-> Decrypting data");
        return decrypt(encryptedData);
    }

    // Dummy encryption/decryption methods for demonstration
    private String encrypt(String data) {
        return "Encrypted(" + data + ")";
    }

    private String decrypt(String data) {
        // Assuming data is in format "Encrypted(...)"
        return data;
    }
}
