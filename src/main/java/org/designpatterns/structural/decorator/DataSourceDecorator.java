package org.designpatterns.structural.decorator;

// The abstract base decorator class. It implements the interface and holds a reference
// to another DataSource object.
public abstract class DataSourceDecorator implements DataSource {
    // The wrapped component.
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    // The base decorator delegates all work to the wrapped component.
    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
