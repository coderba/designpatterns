package org.designpatterns.structural.flyweight;

import org.designpatterns.structural.flyweight.model.Color;
import org.designpatterns.structural.flyweight.model.Tree;
import org.designpatterns.structural.flyweight.model.TreeType;

public class Flyweigth {
    public static void main(String[] args) {
        TreeType treeType = new TreeType("standart", Color.RED, "other");
        Tree tree = new Tree(0, 0, treeType);


        TreeType treeType1 = new TreeType("standart", Color.RED, "other");
        Tree tree1 = new Tree(0, 0, treeType1);

        System.out.println("equal: " + tree.equals(tree1));
    }
}
