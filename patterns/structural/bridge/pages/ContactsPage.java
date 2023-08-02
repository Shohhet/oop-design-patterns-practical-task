package patterns.structural.bridge.pages;

import patterns.structural.bridge.themes.Theme;

public class ContactsPage implements WebPage{
    private final Theme theme;
    private final String content;

    public ContactsPage(Theme theme) {
        this.content = "Contacts web page content";
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return content + " at " + theme.getTheme();
    }
}
