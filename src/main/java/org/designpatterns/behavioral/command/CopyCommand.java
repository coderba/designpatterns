package org.designpatterns.behavioral.command;

// Concrete Command for Copy
public class CopyCommand implements Command {
    private TextEditor editor;
    private String textToCopy;

    public CopyCommand(TextEditor editor, String textToCopy) {
        this.editor = editor;
        this.textToCopy = textToCopy;
    }

    @Override
    public void execute() {
        editor.copy(textToCopy);
    }

    @Override
    public void undo() {
        System.out.println("Undo not supported for Copy operation.");
    }
}
