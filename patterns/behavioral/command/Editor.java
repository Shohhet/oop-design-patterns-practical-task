package patterns.behavioral.command;

import patterns.behavioral.command.command.Command;

public class Editor {
    public Editor() {
    }

    public void runCommand(Command command) {
        command.execute();
    }
}
