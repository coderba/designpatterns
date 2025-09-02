package org.designpatterns.behavioral.chainofresponsibility;

public class GeneralInquiryHandler extends HelpDeskHandler{
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("general")) {
            System.out.println("✅ General Inquiry Handler: Handling a general question.");
        } else if (nextHandler != null) {
            System.out.println("➡️ General Inquiry Handler: Cannot handle this. Passing to the next handler.");
            nextHandler.handleRequest(requestType);
        }
    }
}
