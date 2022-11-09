package logic;

import logic.animal.Animal;
import logic.eatable.Substance;

import java.util.ArrayList;

public class JungleMap {
    ArrayList<Player> players;
    ArrayList<Player> bots;

    ArrayList<Substance> substances;
    ArrayList<Animal> animals;

    public JungleMap() {
        this.players = new ArrayList<>();
        this.bots = new ArrayList<>();
        this.substances = new ArrayList<>();
        this.animals = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void addBot(Player bot) {
        this.bots.add(bot);
    }
}
