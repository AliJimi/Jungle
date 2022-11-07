package logic;

import logic.attack.AttackMechanism;
import logic.defence.DefenceMechanism;
import logic.eatable.Substance;

import java.util.ArrayList;

public class Animal {
    private String id;

    private String name;

    private ArrayList<AttackMechanism> attackMechanisms;
    private ArrayList<DefenceMechanism> defenceMechanisms;
    private Health health;
    private Movement walk;
    private Movement run;


    public void attack(ArrayList<Animal> animals) {

    }

    public void defence(ArrayList<Animal> animals) {

    }

    public void eat(ArrayList<Substance> substances) {

    }

    public void run() {

    }

    public void walk() {

    }
}
