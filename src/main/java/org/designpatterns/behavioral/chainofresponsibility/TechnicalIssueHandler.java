package org.designpatterns.behavioral.chainofresponsibility;

public class TechnicalIssueHandler extends HelpDeskHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("technical")) {
            System.out.println("✅ Technical Issue Handler: Resolving a technical issue.");
        } else if (nextHandler != null) {
            System.out.println("➡️ Technical Issue Handler: Cannot handle this. Passing to the next handler.");
            nextHandler.handleRequest(requestType);
        }
    }
}
