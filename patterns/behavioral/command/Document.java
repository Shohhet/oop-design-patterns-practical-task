package patterns.behavioral.command;

public class Document {
    private String content = "";
    public void write(String newContent) {
        content = content + newContent;
    }
    public  void delete(int numberOfCharacters) {
        content = content.substring(0, content.length() - numberOfCharacters);
    }

    public String print() {
        return content;
    }
}
