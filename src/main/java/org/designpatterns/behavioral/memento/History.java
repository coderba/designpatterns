package org.designpatterns.behavioral.memento;

// Caretaker
// It holds a stack of Memento objects
import java.util.Stack;

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
