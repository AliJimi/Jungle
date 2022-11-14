package logic.battle;

import logic.Player;

public abstract class PlayerBattle {
    protected Player player1;
    protected Player player2;

    public PlayerBattle() {

    }
    public PlayerBattle(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public abstract void start();
}
