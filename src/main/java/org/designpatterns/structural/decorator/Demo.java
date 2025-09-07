package org.designpatterns.structural.decorator;

public class Demo {
    public static void main(String[] args) {
        String importantData = "User login credentials";

        // 1. Create a plain data source object
        DataSource plainSource = new FileDataSource("data.txt");
        System.out.println("--- Writing/Reading with Plain Source ---");
        plainSource.writeData(importantData);
        System.out.println("Read data: " + plainSource.readData());

        System.out.println("\n" + "=".repeat(40) + "\n");

        // 2. Wrap it with an Encryption Decorator
        DataSource encryptedSource = new EncryptionDecorator(new FileDataSource("encrypted_data.txt"));
        System.out.println("--- Writing/Reading with Encrypted Source ---");
        encryptedSource.writeData(importantData);
        System.out.println("Read data: " + encryptedSource.readData());

        System.out.println("\n" + "=".repeat(40) + "\n");

        // 3. Wrap it with both Compression and Encryption Decorators
        // The order matters! Here we compress first, then encrypt.
        DataSource complexSource = new EncryptionDecorator(
                new CompressionDecorator(
                        new FileDataSource("super_secret_data.txt")));

        System.out.println("--- Writing/Reading with Complex Source (Compressed then Encrypted) ---");
        complexSource.writeData(importantData);
        System.out.println("\n--- Now Reading ---");
        System.out.println("Read data: " + complexSource.readData());
    }
}
