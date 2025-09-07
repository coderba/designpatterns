package org.designpatterns.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        System.out.println("-> Compressing data");
        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        String compressedData = super.readData();
        System.out.println("-> Decompressing data");
        return decompress(compressedData);
    }

    // Dummy compression/decompression methods for demonstration
    private String compress(String data) {
        return "Compressed(" + data + ")";
    }

    private String decompress(String data) {
        // Assuming data is in format "Compressed(...)"
        return data;
    }
}
