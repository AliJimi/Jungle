package logic.battle;

import logic.Player;

import java.util.ArrayList;

public class MultiPlayerBattle extends PlayerBattle {
    public MultiPlayerBattle() {
    }

    @Override
    public void start() {

    }

    public void start(ArrayList<Player> attackerPlayers, ArrayList<Player> defenderPlayers, boolean random) {
        if (attackerPlayers.size() == 0 || defenderPlayers.size() == 0) {
            return;
        }

        if (random) {// Randomly play each player to player
            for (Player attackerPlayer : attackerPlayers) {

            }
        } else {

        }
    }
}
