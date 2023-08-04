package patterns.behavioral.command;

import patterns.behavioral.command.command.DeleteCommand;
import patterns.behavioral.command.command.PrintCommand;
import patterns.behavioral.command.command.WriteCommand;

public class CommandRunner {
    public static void main(String[] args) {
        Document document = new Document();
        Editor editor = new Editor();

        editor.runCommand(new WriteCommand(document, "Hello! How are you today?"));
        editor.runCommand(new PrintCommand(document));
        editor.runCommand(new DeleteCommand(document, 7));
        editor.runCommand(new PrintCommand(document));
    }
}
