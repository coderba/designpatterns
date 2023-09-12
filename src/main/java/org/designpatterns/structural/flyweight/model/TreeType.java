package org.designpatterns.structural.flyweight.model;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getOtherTreeData() {
        return otherTreeData;
    }

    public void setOtherTreeData(String otherTreeData) {
        this.otherTreeData = otherTreeData;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((otherTreeData == null) ? 0 : otherTreeData.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TreeType other = (TreeType) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (color != other.color)
            return false;
        if (otherTreeData == null) {
            if (other.otherTreeData != null)
                return false;
        } else if (!otherTreeData.equals(other.otherTreeData))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TreeType [name=" + name + ", color=" + color + ", otherTreeData=" + otherTreeData + "]";
    }    

    
}
