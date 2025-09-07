package org.designpatterns.structural.decorator;

// Concrete component - the base object we will decorate.
public record FileDataSource(String filename) implements DataSource {

    @Override
    public void writeData(String data) {
        System.out.println("Writing raw data to " + filename + ": " + data);
        // In a real app, this would write to a file.
    }

    @Override
    public String readData() {
        System.out.println("Reading raw data from " + filename);
        // In a real app, this would read from a file.
        return "Raw Data";
    }
}
