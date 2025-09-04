package org.designpatterns.behavioral.visitor;

public record Image(String path) implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
