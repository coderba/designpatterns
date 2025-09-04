package org.designpatterns.behavioral.visitor;

public record Text(String content) implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

