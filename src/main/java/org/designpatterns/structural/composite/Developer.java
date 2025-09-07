package org.designpatterns.structural.composite;

public record Developer(String name, String role) implements Employee {
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "- Developer: " + name + " (" + role + ")");
    }
}
