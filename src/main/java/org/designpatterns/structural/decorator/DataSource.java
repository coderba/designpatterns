package org.designpatterns.structural.decorator;

// The common interface for both wrappers and wrapped objects.
public interface DataSource {
    void writeData(String data);

    String readData();
}
