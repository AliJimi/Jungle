package logic.battle;

import logic.animal.Animal;

import java.util.ArrayList;

public abstract class AnimalBattle {
    protected ArrayList<Animal> animals;

    public AnimalBattle() {
        this.animals = new ArrayList<>();
    }
    public abstract void start();
}
