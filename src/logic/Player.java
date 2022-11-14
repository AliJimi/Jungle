package logic;

import logic.animal.Animal;
import logic.eatable.Substance;

import java.util.ArrayList;

public class Player {
    private String id;

    private String username;
    private String firstName;
    private String lastName;

    private ArrayList<Animal> animals;

    private ArrayList<Substance> substances;

    public Player() {
        this.animals = new ArrayList<>();
        this.id = "0";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public String toString() {
        return "Player (" + this.id + ": " + this.username + ")";
    }

    public void setId(String id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return null;
    }
}
