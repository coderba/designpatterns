package org.designpatterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Circle circle = new Circle(2, 4, "yellow", 1);
        Circle circle1 = (Circle) circle.clone();
        System.out.println(circle1.equals(circle));
    }
}