package patterns.structural.bridge.pages;

import patterns.structural.bridge.themes.Theme;

public class LandingPage implements WebPage {
    private final Theme theme;
    private final String content;

    public LandingPage(Theme theme) {
        this.content = "Landing web page content";
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return content + " at " + theme.getTheme();
    }
}
