package org.designpatterns.behavioral.memento;

// The Memento. 
// As we can see, we choose to use String instead of StringBuilder to prevent any update of the current text by outsiders.
public class TextWindowState {
    private final String text;

    public TextWindowState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
