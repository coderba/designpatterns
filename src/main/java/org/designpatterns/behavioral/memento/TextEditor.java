package org.designpatterns.behavioral.memento;

// Originator
public class TextEditor {
    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public void addText(String newText) {
        this.text += newText;
        System.out.println("Current text: " + this.text);
    }

    public String getText() {
        return text;
    }

    // Creates a Memento (saves the state)
    public TextEditorMemento save() {
        return new TextEditorMemento(this.text);
    }

    // Restores the state from a Memento
    public void restore(TextEditorMemento memento) {
        this.text = memento.getSavedState();
        System.out.println("Restored text: " + this.text);
    }
}
