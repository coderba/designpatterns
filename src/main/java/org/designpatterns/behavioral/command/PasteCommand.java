package org.designpatterns.behavioral.command;

// Concrete Command for Paste
public class PasteCommand implements Command {
    private TextEditor editor;
    private String textToPaste;

    public PasteCommand(TextEditor editor, String textToPaste) {
        this.editor = editor;
        this.textToPaste = textToPaste;
    }

    @Override
    public void execute() {
        editor.paste(textToPaste);
    }

    @Override
    public void undo() {
        // Simple undo logic for paste
        editor.delete(textToPaste.length());
        System.out.println("Undo Paste: Undid the last paste operation.");
    }
}
