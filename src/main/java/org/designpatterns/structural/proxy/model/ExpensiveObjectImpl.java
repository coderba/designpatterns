package org.designpatterns.structural.proxy.model;

public class ExpensiveObjectImpl implements ExpensiveObject {
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("[ExpensiveObjectImpl.process] processing complete");
    }

    private void heavyInitialConfiguration() {
        System.out.println("[ExpensiveObjectImpl.process] Loading HEAVY OBJECT initial configuration...");
    }
}
