package patterns.structural.facade;

import patterns.structural.facade.internet.Browser;

public class FacadeRunner {
    public static void main(String[] args) {
        Browser chrome = new Browser();
        System.out.println(chrome.getWebPage("www.google.com"));
    }
}
