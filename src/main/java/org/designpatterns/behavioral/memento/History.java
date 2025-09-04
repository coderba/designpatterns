package org.designpatterns.behavioral.memento;

import java.util.Stack;

// Caretaker
// It holds a stack of Memento objects
public class History {
    private final Stack<TextEditorMemento> history = new Stack<>();

    public void save(TextEditorMemento memento) {
        history.push(memento);
    }

    public TextEditorMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
