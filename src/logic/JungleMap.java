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
        String id = String.valueOf(this.players.size());
        player.setId(id);
        this.players.add(player);
    }

    public Player getPlayer(String id) {
        return this.getPlayer(Integer.parseInt(id));
    }

    public Player getPlayer(int id) {
        return this.players.get(id);
    }

    public void addBot(Player bot) {
        this.bots.add(bot);
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }
}
