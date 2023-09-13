package org.designpatterns.structural.flyweight;

import org.designpatterns.structural.flyweight.model.Color;
import org.designpatterns.structural.flyweight.model.Forest;

public class Main {
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    static int CANVAS_SIZE = 500;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < (TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer OAK", Color.RED, "other");
        }

        for (int i = 0; i < (TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Winter OAK", Color.RED, "other");
        }

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
