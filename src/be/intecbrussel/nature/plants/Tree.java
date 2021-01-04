package be.intecbrussel.nature.plants;

public class Tree extends Plant {
    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return String.format("\nTREE - Name: %-25s Height: %-15.2f Type: %s", getName(), getHeight(), leafType);

    }
}

