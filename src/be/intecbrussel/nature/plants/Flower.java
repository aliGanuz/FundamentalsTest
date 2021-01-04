package be.intecbrussel.nature.plants;

public class Flower extends Plant {
    private Scent smell;

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return String.format("\nFLOWER - Name: %-25s Height: %-15.2f Type: %s", getName(), getHeight(), smell);
    }

}
