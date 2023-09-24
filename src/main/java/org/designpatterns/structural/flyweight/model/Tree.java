package org.designpatterns.structural.flyweight.model;

public class Tree {
    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + ((treeType == null) ? 0 : treeType.hashCode());
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
        Tree other = (Tree) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        if (treeType == null) {
            if (other.treeType != null)
                return false;
        } else if (!treeType.equals(other.treeType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tree [x=" + x + ", y=" + y + ", treeType=" + treeType + "]";
    }
}
