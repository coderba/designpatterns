package org.designpatterns.behavioral.visitor;

public interface Visitor {
    void visit(Text text);
    void visit(Image image);
    void visit(Table table);
}
