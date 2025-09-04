package org.designpatterns.behavioral.memento;

// Immutable class that holds a snapshot
public final class TextEditorMemento {
    private final String state;

    // The constructor is private to ensure only the Originator can create it
    TextEditorMemento(String state) {
        this.state = state;
    }

    public String getSavedState() {
        return state;
    }
}
