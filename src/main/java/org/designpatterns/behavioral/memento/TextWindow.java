package org.designpatterns.behavioral.memento;

// The Originator
// TextWindow class with methods to create and consume the Memento object
public class TextWindow {
    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public String getCurrentText(){
        return currentText.toString();
    }

    public void addText(String text){
        currentText.append(text);
    }

    public TextWindowState save(){
        return new TextWindowState(getCurrentText());
    }

    public void restore(TextWindowState save){
        currentText = new StringBuilder(save().getText());
    }
}
