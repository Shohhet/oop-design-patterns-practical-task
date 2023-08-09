package patterns.behavioral.memento.game;

public class Character {
    private final String name;
    private int health;
    private int gold;

    public Character(String name, int health, int gold) {
        this.name = name;
        this.health = health;
        this.gold = gold;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getGold() {
        return gold;
    }
}
