import cli.Executor;
import logic.JungleMap;
import logic.Player;
import logic.animal.Animal;
import logic.animal.LivestockAnimal;
import logic.animal.WildAnimal;

public class Main {
    public static void main(String[] args) {
        JungleMap map = new JungleMap();
        Player player1 = new Player();
        Player player2 = new Player();

        Animal animal1 = new WildAnimal();
        Animal animal2 = new LivestockAnimal();

        player1.addAnimal(animal1);
        player2.addAnimal(animal1);

        map.addPlayer(player1);
        map.addPlayer(player2);

        Executor executor = new Executor(map);
        executor.loop();
    }
}