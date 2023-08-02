package patterns.structural.bridge.pages;

import patterns.structural.bridge.themes.Theme;

public class MainPage implements WebPage{
    private final Theme theme;
    private final String content;

    public MainPage(Theme theme) {
        this.content = "Main web page content";
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return content + " at " + theme.getTheme();
    }
}
