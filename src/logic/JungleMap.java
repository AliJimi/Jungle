package logic;

import logic.eatable.Substance;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.HashMap;

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

    public boolean addPlayer(Player player) {
        this.players.add(player);
        return true;
    }

    public boolean addBot(Player bot) {
        this.bots.add(bot);
        return true;
    }
}
