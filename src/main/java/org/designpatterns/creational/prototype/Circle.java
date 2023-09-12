package org.designpatterns.creational.prototype;

public class Circle extends Shape {
    public int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(getX(), getY(), getColor(), getRadius());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
