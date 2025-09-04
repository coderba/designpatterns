package org.designpatterns.behavioral.memento;

public class Demo {
    public static void main(String[] args) {
        org.designpatterns.behavioral.memento.TextEditor editor = new org.designpatterns.behavioral.memento.TextEditor("");
        editor.addText("Initial content.");
        History history = new History();

        // Save the initial state
        System.out.println("\n--- Performing an Save ---\n");
        history.save(editor.save());

        editor.addText(" Some new words.");

        // Save the new state
        System.out.println("\n--- Performing an Save ---\n");
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
