package patterns.behavioral.memento.game;

public class Game {
    private final GameCore core;

    public Game(String characterName) {
        Character character = new Character(characterName, 100, 10);
        this.core = new GameCore(character);
    }

    public void  play() {
        for (int i = 0; i < 10; i++) {
            System.out.println("==========================================================");
            Save currentSave = core.save();
            if(!core.play()) {
                System.out.println("Loading saved game.....");
                core.load(currentSave);
            }
        }
    }
}
