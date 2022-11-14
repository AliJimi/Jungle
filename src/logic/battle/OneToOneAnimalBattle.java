package logic.battle;

import logic.animal.Animal;

public class OneToOneAnimalBattle extends AnimalBattle {
    public OneToOneAnimalBattle(Animal animal1, Animal animal2) {
        super();
        this.animals.add(animal1);
        this.animals.add(animal2);
    }

    @Override
    public void start() {
        Animal animal1 = this.animals.get(0), animal2 = this.animals.get(1);
    }
}
