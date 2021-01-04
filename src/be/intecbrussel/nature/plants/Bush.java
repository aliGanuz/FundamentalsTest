package be.intecbrussel.nature.plants;

public class Bush extends Plant {
    private LeafType leafType;
    private String fruit;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return String.format("\nBUSH - Name: %-25s Height: %-15.2f Type: %s", getName(), getHeight(), leafType);
    }
}
