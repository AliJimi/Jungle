package logic.battle;

import logic.Player;

public class SinglePlayerBattle extends PlayerBattle {

    public SinglePlayerBattle(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public void start() {
        AnimalBattle animalBattle = new OneToOneAnimalBattle(this.player1.getAnimal(), this.player2.getAnimal());

        animalBattle.start();
    }
}
