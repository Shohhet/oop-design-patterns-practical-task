package patterns.behavioral.command.command;

import patterns.behavioral.command.Document;

public class WriteCommand implements Command{
    private final Document document;
    private final String newContent;
    public WriteCommand(Document document, String newContent) {
        this.document = document;
        this.newContent = newContent;
    }


    @Override
    public void execute() {
        document.write(newContent);
    }
}
