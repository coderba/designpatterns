package org.designpatterns.structural.flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    public static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType type = treeTypes.get(name);
        if (type == null) {
            //System.out.println("new tree type << " + name + " >> will be created...");
            type = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, type);
        }

        //System.out.println("tree type << " + name + " >> exists no tree type will be created...");
        return type;
    }
}
