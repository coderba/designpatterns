package org.designpatterns.behavioral.visitor;

// Element
public interface Element {
    void accept(Visitor visitor);
}
