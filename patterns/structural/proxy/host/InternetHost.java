package patterns.structural.proxy.host;

public class InternetHost implements Host{
    @Override
    public String getWebPage(String url) {
        return "Content of " + url;
    }
}
