package be.intecbrussel.nature.animals;

import be.intecbrussel.nature.plants.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {
    private Set<Plant> plantDiet = new HashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return String.format("\nHERBIVORE - Name: %-15s Weight: %-15.2f Height: %-15.2f Length: %-15.2f",
                getName(), getWeight(), getHeight(), getLength());
    }
}


