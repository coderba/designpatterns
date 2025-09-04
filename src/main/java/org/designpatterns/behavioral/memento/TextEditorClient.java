package org.designpatterns.behavioral.memento;

public class TextEditorClient {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor("Initial content.");
        History history = new History();

        // Save the initial state
        history.save(editor.save());

        editor.addText(" Some new words.");

        // Save the new state
        history.save(editor.save());

        editor.addText(" And more words.");

        System.out.println("\n--- Performing an Undo ---\n");
        // Undo the last change
        TextEditorMemento lastState = history.undo();
        if (lastState != null) {
            editor.restore(lastState);
        }

        System.out.println("\n--- Performing another Undo ---\n");
        // Undo the first change
        lastState = history.undo();
        if (lastState != null) {
            editor.restore(lastState);
        }
    }
}
