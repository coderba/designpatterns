package org.designpatterns.behavioral.visitor;

public record Table(int rows, int cols) implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
