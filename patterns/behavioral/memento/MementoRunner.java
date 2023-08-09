package patterns.behavioral.memento;

import patterns.behavioral.memento.game.Game;

public class MementoRunner {
    public static void main(String[] args) {
        Game diablo = new Game("Nagibatar228");
        diablo.play();
        System.out.println("Need some rest...");
    }
}
