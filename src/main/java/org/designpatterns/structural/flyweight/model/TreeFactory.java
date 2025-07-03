package org.designpatterns.structural.flyweight.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TreeFactory {
    public static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        // Create a composite key that includes all properties that define a unique TreeType
        String compositeKey = createCompositeKey(name, color, otherTreeData);
        TreeType type = treeTypes.get(compositeKey);
        if (type == null) {
            //System.out.println("new tree type << " + name + " >> will be created...");
            type = new TreeType(name, color, otherTreeData);
            treeTypes.put(compositeKey, type);
        }

        //System.out.println("tree type << " + name + " >> exists no tree type will be created...");
        return type;
    }
    
    private static String createCompositeKey(String name, Color color, String otherTreeData) {
        return name + "|" + Objects.toString(color, "null") + "|" + Objects.toString(otherTreeData, "null");
    }
}
