package patterns.behavioral.memento.game;

import java.time.LocalTime;
import java.util.Random;

public class GameCore {
    private final Character character;
    private int currentLevelNumber;
    private final Random random;

    public GameCore(Character character) {
        this.character = character;
        currentLevelNumber = 0;
        random = new Random(LocalTime.now().getNano());
    }

    public boolean play() {
        printStats();
        boolean isAlive = random.nextBoolean();
        if (isAlive) {
            character.setHealth(random.nextInt(100));
            character.setGold(random.nextInt(1000));
            currentLevelNumber = currentLevelNumber < GameLevel.values().length - 1 ? currentLevelNumber + 1 : 0;
            System.out.println("You successfully complete level.");

        } else {
            character.setHealth(0);
            character.setGold(0);
            System.out.println("You was defeated.");

        }
        return isAlive;

    }
    private void printStats() {
        System.out.println("Current level: " + GameLevel.values()[currentLevelNumber]);
        System.out.println("Character " + character.getName());
        System.out.println("Health " + character.getHealth() + "%");
        System.out.println("Gold " + character.getGold());

    }

    public Save save() {
        return new Save(new Character(character.getName(), character.getHealth(), character.getGold()) , currentLevelNumber);
    }
    public void load(Save save) {
        character.setGold(save.character().getGold());
        character.setHealth(save.character().getHealth());
        currentLevelNumber = save.currentLevel();
    }
}
