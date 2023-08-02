package patterns.structural.facade.internet;

public class OperationSystem {
    public static String resolveUrl(String url) {
        return "Searching IP at OS cache for URL " + url;
    }
}
