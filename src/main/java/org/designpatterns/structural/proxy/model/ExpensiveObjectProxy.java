package org.designpatterns.structural.proxy.model;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject expensiveObject;

    public ExpensiveObjectProxy() {
        System.out.println("Proxy created");
    }

    @Override
    public void process() {
        System.out.println("[ExpensiveObjectProxy.process] process method called");
        if (expensiveObject == null) {
            System.out.println("[ExpensiveObjectProxy.process] Lazy loading...");
            expensiveObject = new ExpensiveObjectImpl();
        } else {
            System.out.println("[ExpensiveObjectProxy.process] Expensive object already exist.");
        }

        expensiveObject.process();
    }
}
