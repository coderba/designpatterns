package org.designpatterns.structural.proxy;

import org.designpatterns.structural.proxy.model.ExpensiveObjectProxy;

// https://www.baeldung.com/java-proxy-pattern
public class Main {
    public static void main(String[] args) {
        ExpensiveObjectProxy expensiveObjectProxy = new ExpensiveObjectProxy();
        expensiveObjectProxy.process();
        expensiveObjectProxy.process();
    }
}
