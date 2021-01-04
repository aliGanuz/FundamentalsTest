package be.intecbrussel.nature.animals;

public class Carnivore extends Animal {
    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return String.format("\nCARNIVORE - Name: %-15s Weight: %-15.2f Height: %-15.2f Length: %-15.2f MaxFood: %-15.2f",
                getName(), getWeight(), getHeight(), getLength(), getMaxFoodSize());
    }

}
