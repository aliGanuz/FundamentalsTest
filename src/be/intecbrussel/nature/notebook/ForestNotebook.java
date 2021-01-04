package be.intecbrussel.nature.notebook;

import be.intecbrussel.nature.animals.Animal;
import be.intecbrussel.nature.animals.Carnivore;
import be.intecbrussel.nature.animals.Herbivore;
import be.intecbrussel.nature.animals.Omnivore;
import be.intecbrussel.nature.plants.Plant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ForestNotebook {
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();

    private int plantCount;
    private int animalCount;

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);

    }

    public void addPlant(Plant plant) {
        plants.add(plant);
        plantCount++;
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName));
    }

    public void printNotebook() {
        System.out.println("ANIMALS");
        for (Animal animal: animals){
            System.out.println(animal);
        }
        System.out.println("\nPLANTS");
        for (Plant p: plants){
            System.out.println(p);
        }
    }

    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
    }
}
