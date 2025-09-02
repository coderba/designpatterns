package org.designpatterns.behavioral.chainofresponsibility;

public class BillingProblemHandler extends HelpDeskHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("billing")) {
            System.out.println("✅ Billing Problem Handler: Addressing a billing concern.");
        } else if (nextHandler != null) {
            System.out.println("➡️ Billing Problem Handler: Cannot handle this. Passing to the next handler.");
            nextHandler.handleRequest(requestType);
        }
    }
}
