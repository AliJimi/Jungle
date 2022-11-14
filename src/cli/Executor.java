package cli;

import logic.JungleMap;
import logic.Player;
import logic.battle.AnimalBattle;
import logic.battle.OneToOneAnimalBattle;
import logic.battle.PlayerBattle;
import logic.battle.SinglePlayerBattle;

import java.util.Scanner;

public class Executor {
    JungleMap map;
    Scanner cin;

    public Executor(JungleMap map) {
        this.cin = new Scanner(System.in);
        this.map = map;
    }

    public void loop() {
        String command;

        label:
        while (true) {
            this.showCommandMenu();
            command = this.cin.nextLine();
            if (!command.isEmpty()) {
                switch (command) {
                    case "0":
                    case "exit":
                        break label;
                    case "1":
                    case "add player":
                        addPlayer();
                        break;
                    case "2":
                    case "show players":
                        for (Player player : map.getPlayers()) {
                            System.out.printf("%s\n", player);
                        }
                        break;
                    case "3":
                    case "random battle":
                        this.battleHumanVsRandomBot();
                        break;
                }
            }
        }
    }

    private void addPlayer() {
        Player player = new Player();
        System.out.printf("Player name: ");
        player.setUsername(cin.next());

        this.map.addPlayer(player);
    }

    private void showCommandMenu() {
        System.out.printf("Commands:\n" +
                "1. add player\n" +
                "2. show players\n" +
                "3. random battle\n" +
                "0. exit\n"
        );
    }

    private void battleHumanVsRandomBot() {
        int randomBotId = 0;
        System.out.printf("Human Player id: ");
        Player humanPlayer = map.getPlayer(cin.nextInt());
        Player botPlayer = map.getPlayer(randomBotId);

        PlayerBattle battle = new SinglePlayerBattle(humanPlayer, botPlayer);

        battle.start();
    }
}
