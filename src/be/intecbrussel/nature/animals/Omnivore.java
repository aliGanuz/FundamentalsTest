package be.intecbrussel.nature.animals;

import be.intecbrussel.nature.plants.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {
    private Set<Plant> plantDiet = new HashSet<>();
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return String.format("\nOMNIVORE - Name: %-15s Weight: %-15.2f Height: %-15.2f Length: %-15.2f MaxFood: %-15.2f",
                getName(), getWeight(), getHeight(), getLength(), getMaxFoodSize());
    }
}
