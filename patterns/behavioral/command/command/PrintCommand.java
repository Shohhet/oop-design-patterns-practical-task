package patterns.behavioral.command.command;

import patterns.behavioral.command.Document;

public class PrintCommand implements Command{
    private final Document document;

    public PrintCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println(document.print());
    }
}
