package org.designpatterns.behavioral.chainofresponsibility;

public abstract class HelpDeskHandler {
    protected HelpDeskHandler nextHandler;
    public void setNextHandler(HelpDeskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void handleRequest(String request);
}
