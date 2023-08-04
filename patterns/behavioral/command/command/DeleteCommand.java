package patterns.behavioral.command.command;

import patterns.behavioral.command.Document;

public class DeleteCommand implements Command{
    private final Document document;

    private final int numberOfCharacters;
    public DeleteCommand(Document document, int numberOfCharacters) {
        this.document = document;
        this.numberOfCharacters = numberOfCharacters;
    }
    @Override
    public void execute() {
        document.delete(numberOfCharacters);
    }
}
