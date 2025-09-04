package org.designpatterns.behavioral.visitor;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Element> document = List.of(
                new Text("Hello Visitor"),
                new Image("/images/logo.png"),
                new Table(3, 4)
        );

        Visitor renderVisitor = new RenderVisitor();
        Visitor exportVisitor = new ExportVisitor();

        System.out.println("=== Rendering ===");
        document.forEach(part -> part.accept(renderVisitor));

        System.out.println("\n=== Exporting ===");
        document.forEach(part -> part.accept(exportVisitor));

    }
}
