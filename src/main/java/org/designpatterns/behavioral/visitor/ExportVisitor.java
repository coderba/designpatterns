package org.designpatterns.behavioral.visitor;

public class ExportVisitor implements Visitor {
    @Override
    public void visit(Text text) {
        System.out.println("Exporting text to PDF: " + text.content());
    }

    @Override
    public void visit(Image image) {
        System.out.println("Exporting image file: " + image.path());
    }

    @Override
    public void visit(Table table) {
        System.out.println("Exporting table with " + table.rows() + " rows and " + table.cols() + " cols.");
    }
}
