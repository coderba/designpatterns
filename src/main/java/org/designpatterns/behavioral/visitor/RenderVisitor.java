package org.designpatterns.behavioral.visitor;

public class RenderVisitor implements Visitor {
    @Override
    public void visit(Text text) {
        System.out.println("Rendering text:" + text);
    }

    @Override
    public void visit(Image image) {
        System.out.println("Rendering image:" + image);
    }

    @Override
    public void visit(Table table) {
        System.out.println("Rendering table with " + table.rows() + "x" + table.cols());
    }
}
