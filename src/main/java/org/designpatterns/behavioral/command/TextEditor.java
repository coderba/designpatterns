package org.designpatterns.behavioral.command;

// Receiver
public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void copy(String textToCopy){
        System.out.println("Copied: '" + textToCopy + "'");
    }

    public void paste(String textToPaste) {
        text.append(textToPaste);
        System.out.println("Pasted: Current text is now '" + text + "'");
    }

    public void delete(int length) {
        if (text.length() >= length) {
            String deletedText = text.substring(text.length() - length);
            text.delete(text.length() - length, text.length());
            System.out.println("Deleted: '" + deletedText + "'");
        }
    }
}
