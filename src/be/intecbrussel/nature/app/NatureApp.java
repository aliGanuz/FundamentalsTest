package be.intecbrussel.nature.app;

import be.intecbrussel.nature.animals.*;
import be.intecbrussel.nature.notebook.ForestNotebook;
import be.intecbrussel.nature.plants.*;


public class NatureApp {
    public static void main(String[] args) {

        ForestNotebook notebook = new ForestNotebook();

        //PLANTS
        Plant banyanTree = new Tree("Banyan Tree", 30);
        Plant whiteAshTree = new Tree("White Ash Tree", 15);
        Plant marigold =  new Bush("Marigold", 0.60);
        Plant rose = new Flower("Rose", 0.30);
        Plant skunk = new Weed("Skunk", 0.40);

        //ANIMALS
        Carnivore bear = new Carnivore("Bear", 350, 1, 2 );
        Carnivore lion = new Carnivore("Lion", 250, 1.3, 1);
        Carnivore cheetah = new Carnivore("Cheetah", 200, 1.1,1.2);
        Herbivore camel = new Herbivore("Camel", 250, 2,3);
        Herbivore donkey = new Herbivore("Donkey", 150, 1.5,2);
        Herbivore buffalo = new Herbivore("Buffalo", 200, 2, 2);
        Omnivore pig = new Omnivore("Pig", 150, 1.5, 1);
        Omnivore rat = new Omnivore("Rat", 0.50, 0.30, 0.50);
        Omnivore racoon = new Omnivore("Racoon", 1.5, 0.50, 0.80);

        //Notebook Plants
        notebook.addPlant(banyanTree);
        notebook.addPlant(whiteAshTree);
        notebook.addPlant(marigold);
        notebook.addPlant(rose);
        notebook.addPlant(skunk);

        //Notebook Animals
        notebook.addAnimal(bear);
        notebook.addAnimal(lion);
        notebook.addAnimal(cheetah);
        notebook.addAnimal(camel);
        notebook.addAnimal(donkey);
        notebook.addAnimal(buffalo);
        notebook.addAnimal(pig);
        notebook.addAnimal(rat);
        notebook.addAnimal(racoon);

        //PRINT
        System.out.println("\nNumber of Animals: " + notebook.getAnimalCount());
        System.out.println("Number of Plants: " + notebook.getPlantCount());

        System.out.println("\nCARNIVORES");
        for (Carnivore carnivore : notebook.getCarnivores()) {
            System.out.println(carnivore);
        }

        System.out.println("\nOMNIVORES");
        for (Omnivore omnivore : notebook.getOmnivores()) {
            System.out.println(omnivore);
        }

        System.out.println("\nHERBIVORES");
        for (Herbivore herbivore : notebook.getHerbivores()) {
            System.out.println(herbivore);
        }

        notebook.sortAnimalsByName();
        notebook.sortPlantsByName();
        System.out.println("\n----Lists Sorted by Name----\n");
        notebook.printNotebook();

        notebook.sortAnimalsByHeight();
        notebook.sortPlantsByHeight();
        System.out.println("\n----Lists Sorted by Height----\n");
        notebook.printNotebook();

    }
}
