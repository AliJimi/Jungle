package logic.animal;

import logic.Health;
import logic.Movement;
import logic.mechanism.AttackMechanism;
import logic.mechanism.DefenseMechanism;
import logic.eatable.Substance;

import java.util.ArrayList;

public abstract class Animal {
    private String id;

    private String name;

    private ArrayList<AttackMechanism> attackMechanisms;
    private ArrayList<DefenseMechanism> defenseMechanisms;
    private Health health;
    private Movement walk;
    private Movement run;


    public abstract void eat(ArrayList<Substance> substances);

    public AttackMechanism getAttackMechanism() {
        return attackMechanisms.get(0);
    }
}
