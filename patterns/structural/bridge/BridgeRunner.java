package patterns.structural.bridge;

import patterns.structural.bridge.pages.ContactsPage;
import patterns.structural.bridge.pages.LandingPage;
import patterns.structural.bridge.pages.MainPage;
import patterns.structural.bridge.pages.WebPage;
import patterns.structural.bridge.themes.ClassicalTheme;
import patterns.structural.bridge.themes.DarkTheme;

public class BridgeRunner {
    public static void main(String[] args) {
        WebPage webPage = new MainPage(new DarkTheme());
        System.out.println(webPage.getContent());

        webPage = new ContactsPage(new ClassicalTheme());
        System.out.println(webPage.getContent());

        webPage = new LandingPage(new DarkTheme());
        System.out.println(webPage.getContent());

    }
}
