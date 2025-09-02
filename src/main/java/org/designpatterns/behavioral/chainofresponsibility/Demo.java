package org.designpatterns.behavioral.chainofresponsibility;

public class Demo {
    public static void main(String... args){
        HelpDeskHandler general = new GeneralInquiryHandler();
        HelpDeskHandler technical = new TechnicalIssueHandler();
        HelpDeskHandler billing = new BillingProblemHandler();

        general.setNextHandler(technical);
        technical.setNextHandler(billing);

        // Send requests to the first handler in the chain
        System.out.println("Customer submits a general inquiry:");
        general.handleRequest("general");
        System.out.println("\n----------------------------------\n");

        System.out.println("Customer submits a technical issue:");
        general.handleRequest("technical");
        System.out.println("\n----------------------------------\n");

        System.out.println("Customer submits a billing problem:");
        general.handleRequest("billing");
        System.out.println("\n----------------------------------\n");

        System.out.println("Customer submits an unknown request:");
        general.handleRequest("unknown");


    }
}
