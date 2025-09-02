package org.designpatterns.behavioral.command;

public class TextEditorClient {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        Button copyButton = new Button();
        copyButton.setCommand(new CopyCommand(textEditor, "copied text"));

        Button pasteButton = new Button();
        pasteButton.setCommand(new PasteCommand(textEditor, "copied text"));

        copyButton.click();
        copyButton.undoLastAction();

        pasteButton.click();
        pasteButton.undoLastAction();
    }
}
