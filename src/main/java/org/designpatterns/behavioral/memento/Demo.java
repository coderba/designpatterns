//package org.designpatterns.behavioral.memento;
//
//import org.designpatterns.behavioral.memento.model.TextEditor;
//import org.designpatterns.behavioral.memento.model.TextWindow;
//
//// https://www.baeldung.com/java-memento-design-pattern
//// https://github.com/eugenp/tutorials/tree/master/patterns-modules/design-patterns-behavioral-2/src/main/java/com/baeldung/memento
//public class Demo {
//    public static void main(String[] args) {
//        TextEditor textEditor = new TextEditor(new TextWindow());
//        textEditor.write("The Memento Design Pattern\n");
//        textEditor.write("How to implement it in Java?\n");
//        textEditor.hitSave();
//
//        textEditor.write("Buy milk and eggs before coming home\n");
//
//        textEditor.hitUndo();
//
//        // System.out.println(textEditor.print().equals("The Memento Design Pattern\nHow to implement it in Java?\n"));
//        System.out.println(textEditor.print());
//    }
//}
